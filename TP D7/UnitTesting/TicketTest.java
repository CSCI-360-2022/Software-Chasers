package com.scticketing.ticketingwebsite;

import com.scticketing.ticketingwebsite.event.Event;
import com.scticketing.ticketingwebsite.ticket.Ticket;
import com.scticketing.ticketingwebsite.user.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TicketTest {

    @Test
    public void createTicketTest(){
        User matthew = new User();
        Event songEvent = new Event();
        LocalDate date = LocalDate.of(2022, 8, 30);

        // Testing constructor
        Ticket ticket = new Ticket();

        // Testing setters
        ticket.setAttendee(matthew);
        ticket.setEvent(songEvent);
        ticket.setPurchaseTime(date);

        // Testing getters
        User getUser;
        Event getEvent;
        LocalDate getDate;

        getUser = ticket.getAttendee();
        getEvent = ticket.getEvent();
        getDate = ticket.getPurchaseTime();

        // Testing toString()

        ticket.toString();
    }
}
