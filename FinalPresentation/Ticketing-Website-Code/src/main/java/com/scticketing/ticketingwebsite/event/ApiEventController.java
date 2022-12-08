package com.scticketing.ticketingwebsite.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/events")
public class ApiEventController {
    private final EventService eventService;

    @Autowired
    public ApiEventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/all")
    public List<Event> getAllEvents(){
        return eventService.getEvents();
    }

    @GetMapping("{eventid}")
    public List getEvent(@PathVariable("eventid") long eventId){
        return eventService.getEvent(eventId);
    }

    /*@GetMapping
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
*/
}
