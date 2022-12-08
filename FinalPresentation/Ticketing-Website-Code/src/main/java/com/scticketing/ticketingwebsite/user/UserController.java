package com.scticketing.ticketingwebsite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path= "api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // Register new user, @RequestBody
    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userid}")
    public void deleteUser(@PathVariable("userid") Long userid){
        userService.deleteUser(userid);
    }

}
