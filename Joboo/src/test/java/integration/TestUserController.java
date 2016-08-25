package integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.job.joboo.model.dto.UserDTO;
import org.job.joboo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by firas on 25/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-rest-servlet.xml"})
@WebAppConfiguration
public class TestUserController {
    /**
     * The mock mvc.
     */
    @Autowired
    UserService userService;
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void TestAddUserExpectedPassword() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        UserDTO user = new UserDTO();
        user.setlName("firas");
        user.setfName("sgharo");
        user.setAdress("21 rue pasteur");
        user.setBirthDate("09/05/1990");
        user.setCity("Paris");
        user.setCountry("France");


        mockMvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON).content(mapper.writeValueAsString(user)))
                .andExpect(status().isInternalServerError());

    }


}
