package com.scticketing.ticketingwebsite;

import com.scticketing.ticketingwebsite.event.Event;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EventTest {

    @Test
    public void createEventTest(){
        // Testing constructor
        Event songAndDanceEvent = new Event();
        // Testing setters
        LocalDate startDate = LocalDate.of(2022, 8, 10);
        LocalDate endDate = LocalDate.of(2022, 8, 11);
        //songAndDanceEvent.setEventID(109348109);
        songAndDanceEvent.setEventName("Song and Dance");
        songAndDanceEvent.setCapacity(30);
        songAndDanceEvent.setEventDetails("Singing and dancing");
        songAndDanceEvent.setStartTime(startDate);
        //songAndDanceEvent.setEndTime(endDate);
        songAndDanceEvent.setRemainingSeats(13);

        // Testing getters.
        String eventName, eventDetails;
        long eventId;
        int capacity, remainingSeats;
        LocalDate getStart, getEnd;
        eventDetails = songAndDanceEvent.getEventDetails();
        eventName = songAndDanceEvent.getEventName();
        //eventId = songAndDanceEvent.getEventID();
        capacity = songAndDanceEvent.getCapacity();
        remainingSeats = songAndDanceEvent.getRemainingSeats();
        getStart = songAndDanceEvent.getStartTime();
        //getEnd = songAndDanceEvent.getEndTime();
        //System.out.println(eventDetails, capacity, remainingSeats, getStart);
        // Testing toString.
        songAndDanceEvent.toString();

    }
}
