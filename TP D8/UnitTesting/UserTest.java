package com.scticketing.ticketingwebsite;

import com.scticketing.ticketingwebsite.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    // Tests constructor and all getters and setters.
    @Test
    public void createUserTest(){
        // Testing empty constructor.
        User user = new User();

        // Testing Setters.
        user.setUserID(120020392);
        user.setEmail("hibi@gmail.com");
        user.setFirstName("Hibi");
        user.setLastName("Eisma");
        user.setPassword("Secret");

        // Testing getters.
        String email, firstName, lastName, password;
        email = user.getEmail();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        password = user.getPassword();

        // Testing toString()
        user.toString();

    }
}