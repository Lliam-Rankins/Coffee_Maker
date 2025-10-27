package edu.ncsu.csc.CoffeeMaker.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import edu.ncsu.csc.CoffeeMaker.services.UserService;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith ( SpringExtension.class )
public class TableUserDetailsServiceTest {

    /**
     * MockMvc uses Spring's testing framework to handle requests to the REST
     * API
     */
    private MockMvc                 mvc;

    @Autowired
    private WebApplicationContext   context;

    @Autowired
    private UserService             userService;

    @Autowired
    private TableUserDetailsService userDetailsService;

    /**
     * Sets up the tests.
     */
    @BeforeEach
    public void setup () {
        mvc = MockMvcBuilders.webAppContextSetup( context ).build();

        userService.deleteAll();

    }

    // @Test
    // @Transactional
    // @WithMockUser ( authorities = { "MAKE_COFFEE" } )
    // public void testLoadUserByUsername () {
    // final User user1 = new User( "Tom", "123" );
    // final Role role = new Role();
    // role.setRoleName( "Customer" );
    // user1.setRole( role );
    //
    // userService.save( user1 );
    //
    // assertEquals( user1.getUsername(), userDetailsService.loadUserByUsername(
    // "Tom" ) );
    //
    // }
}
