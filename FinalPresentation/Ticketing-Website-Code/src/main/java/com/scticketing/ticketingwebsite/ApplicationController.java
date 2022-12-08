package com.scticketing.ticketingwebsite;

import com.scticketing.ticketingwebsite.event.Event;
import com.scticketing.ticketingwebsite.event.EventService;
import com.scticketing.ticketingwebsite.user.User;
import com.scticketing.ticketingwebsite.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class ApplicationController {
    private final UserService userService;
    private final EventService eventService;
    private User user;
    @Autowired
    public ApplicationController(UserService userService, EventService eventService) {
        this.userService = userService;
        this.eventService = eventService;
    }
    //public ApplicationController(EventService eventService){this.eventService = eventService;}
    @GetMapping("/login")
    public String showLoginForum() {
        return "views/loginForm";
    }

    @GetMapping("/log")
    public String showLoginLog(){return "views/OldNewLogin";}

    @GetMapping("/register")
    public String registerForm(Model model) {
        //model.addAttribute("register", new User());
        return "views/registerForum";
    }

    @GetMapping("/events")
    public String eventsPage(){
        return "views/EventPage";
    }

    @GetMapping("/purchasePage{eventid}")
    public String addTicket(@PathVariable("eventid") long eventid, Model  model){
        //Event event = eventService.getEvent(eventid);
        Event event = eventService.getEventById(eventid);
        event.setRemainingSeats((event.getRemainingSeats() - 1));
        //System.out.println("Array is here: " +event.getEventName());
        model.addAttribute("purchasePage", event.getEventName());
        userService.addTicket(eventid, user);
        return "redirect:/purchase";
    }

    @GetMapping("/purchase")
    public String purchaseTicket(){
        return "views/purchasePage";
    }

    @PostMapping("/purchasePage")
    public String confirmedPurchase(){
        return "redirect:/confirmedPurchase";
    }

    @GetMapping("/confirmedPurchase")
    public String purchaseConfirmed(){
        return "views/confirmedPurchase";
    }

    @PostMapping("/register")
    public String registerNewUser(WebRequest request, @ModelAttribute User user){
        System.out.println( "Username: " + request.getParameter("username")
                            + "\nFirst name: " + request.getParameter("firstName")
                            + "\nLast name: " + request.getParameter("lastName")
                            + "\nEmail: " + request.getParameter("email")
                            + "\nPassword: " + request.getParameter("password"));
        System.out.println("User: " + user);
        User registeredUser = userService.addNewUser(user);
        //userService.addNewUser(user);
        if (registeredUser == null){
            return "redirect:/error_page";
        } else {
            return "redirect:/login";
        }
        //return registeredUser == null ? "redirect:/error_page" : "redirect:/login";
        //return "views/loginForum"; 18
    }

    @GetMapping("/error_page")
    public String errorPage(){
        return "views/error_page";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user) {
        System.out.println("Login Request: " + user);
        User authenticated = userService.authenticate(user.getUsername(), user.getPassword());
        this.user = user;
        if (authenticated != null) {
            // Add user service add ticket for testing here

            return "redirect:/events";
        } else {
            return "redirect:/error_page";
        }
    }
}
