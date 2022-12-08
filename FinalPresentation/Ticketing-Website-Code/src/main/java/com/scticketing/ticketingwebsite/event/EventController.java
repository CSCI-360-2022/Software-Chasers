package com.scticketing.ticketingwebsite.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }




    @GetMapping("/create-new-event")
    public String eventpage(){
        return "views/createNewEvent";
    }

    @PostMapping("/create-new-event")
    public String createNewEvent(@ModelAttribute Event event, Model model){
        /*System.out.println(request.getParameter("eventName"));
        System.out.println("Create Event Post Reached");
        System.out.println("Event post request: " + event);*/
        model.addAttribute("price", event.getPrice());
        eventService.addNewEvent(event.getEventName(), event.getPrice(), event.getCapacity(),
                event.getEventDetails(), event.getStartTime());
        return "redirect:";
    }

}
