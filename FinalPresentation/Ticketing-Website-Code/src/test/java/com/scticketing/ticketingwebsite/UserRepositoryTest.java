package com.scticketing.ticketingwebsite;

import static org.assertj.core.api.Assertions.assertThat;

import com.scticketing.ticketingwebsite.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    //private UserRepository repo;

    @Test
    public void testCreateUserForDatabase(){

        User user = new User();
        user.setEmail("lawsmb@g.cofc.edu");
        user.setFirstName("Matthew");
        user.setLastName("Laws");
        user.setPassword("a");

        //User savedUser = repo.save(user);
        //User existUser = entityManager.find(User.class, savedUser.getUserID());
        //assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }
}
