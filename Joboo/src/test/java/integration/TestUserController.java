package integration;

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
 * Created by firas on 25/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-rest-servlet.xml"})
@WebAppConfiguration
public class TestUserController {
    /**
     * The mock mvc.
     */
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void TestAddUser() {

    }


}
