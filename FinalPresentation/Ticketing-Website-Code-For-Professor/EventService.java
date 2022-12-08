package com.scticketing.ticketingwebsite.event;

import com.scticketing.ticketingwebsite.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents(){
        return eventRepository.findAll();
    }

    public Event getEventById(long eventId){
        return eventRepository.findByEventId(eventId).get();
    }
    public List getEvent(long eventId){
        return Collections.singletonList(eventRepository.findByEventId(eventId));
    }

    public Event addNewEvent(String eventName, double eventPrice, int capacity,
                             String eventDetails, LocalDate startTime){
        Event event = new Event(capacity, startTime, eventName, eventDetails, eventPrice);

        return eventRepository.save(event);
    }

    // public Event(String foreGroundImageUrl,
    //                 String backGroundImageUrl,
    //                 int capacity, LocalDate startTime,
    //                 String eventName,
    //                 String eventDetails,
    //                 double price) {
    public Event addNewEventWithImages(String eventName, double eventPrice,
                                        int capacity, String eventDetails,
                                       LocalDate startTime, String foreGroundImageUrl,
                                       String backGroundImageUrl, String location){
        Event event = new Event(foreGroundImageUrl, backGroundImageUrl, capacity, startTime, eventName, eventDetails, eventPrice, location);
        return eventRepository.save(event);
    }
}
