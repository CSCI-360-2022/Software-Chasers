package com.scticketing.ticketingwebsite.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            //public User(long userID, String firstName, String lastName, String password, String email) {
            //public User(String firstName, String lastName, String password, String email, Ticket[] tickets) {
            User matthew = new User(
                    "Matthew",
                    "Laws",
                    "1580",
                    "lawsmb@g.cofc.edu",
                    "matt",
                    1);

            User patricia = new User(
                    "Patricia",
                    "Laws",
                    "1580",
                    "patricia@g.cofc.edu",
                    "Patty");

            repository.saveAll(
                    List.of(matthew, patricia)
            );
        };
    }
}
