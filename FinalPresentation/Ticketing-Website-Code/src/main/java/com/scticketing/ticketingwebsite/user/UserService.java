package com.scticketing.ticketingwebsite.user;

import com.scticketing.ticketingwebsite.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // Fetch users from database
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user) {
        Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());
        Optional<User> userByUsername = userRepository.findUserByUsername(user.getUsername());
        String regex = "^(?=.*[0-9])"
                        + "(?=.*[a-z])(?=.*[A-Z])"
                        + "(?=.*[!@#$%^&+=])"
                        + "(?=\\S+$).{15}$";
        Pattern regexPattern = Pattern.compile(regex);
        Matcher regexMatcher = regexPattern.matcher(user.getPassword());
        if (userByEmail.isPresent()){
            System.out.println("Email not available.");
            return null;
            //throw new IllegalStateException("Email not available");
        }
        if (userByUsername.isPresent()){
            System.out.println("Username not available.");
            return null;
            //throw new IllegalStateException("Username taken");
        }
        // Example password: Hotdog1975@buns
        if (!regexMatcher.matches()) {
            System.out.println("Incorrect password.");
            return null;
            /*throw new IllegalStateException("Invalid Password: Password must " +
                    "be of length 15, contain a special character, " +
                    "contain one lower case and upper case letter, " +
                    "and contain at least one number.");*/
        }
        return userRepository.save(user);
    }

    public User authenticate(String username, String password){
        return userRepository.findUserByUsernameAndPassword(username, password).orElse(null);
    }

    public void deleteUser(Long userid) {
        boolean exists = userRepository.existsById(userid);
        if (!exists){
            throw new IllegalStateException("User with id" +
                    userid + " does not exist");
        }
        userRepository.deleteById(userid);
    }


    public void addTicket(long eventId, User user){
        user.setTicketId(eventId);
    }
}
