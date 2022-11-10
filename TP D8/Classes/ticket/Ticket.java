package com.scticketing.ticketingwebsite.ticket;

import com.scticketing.ticketingwebsite.event.Event;
import com.scticketing.ticketingwebsite.user.User;

import java.time.LocalDate;

public class Ticket {
    private User attendee;
    private Event event;
    private LocalDate purchaseTime;


    public Ticket(User attendee, Event event, LocalDate purchaseTime) {
        this.attendee = attendee;
        this.event = event;
        this.purchaseTime = purchaseTime;
    }
    public Ticket(){}
    public User getAttendee() {
        return attendee;
    }

    public void setAttendee(User attendee) {
        this.attendee = attendee;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDate getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(LocalDate purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "attendee=" + attendee +
                ", event=" + event +
                ", purchaseTime=" + purchaseTime +
                '}';
    }
}
