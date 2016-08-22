import org.job.joboo.model.dto.UserDTO;
import org.job.joboo.repository.iRepository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by firas on 22/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-rest-servlet.xml"})
@WebAppConfiguration
public class TestUserControlle {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void createUser() {
        UserDTO userDAO = new UserDTO();
        // créer un user
        // inserer
        // faire l'assert

    }

}
