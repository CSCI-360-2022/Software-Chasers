package com.scticketing.ticketingwebsite.event;

import java.time.LocalDate;

public class Event {
    private long eventID;
    public int capacity;
    public int remainingSeats;
    public LocalDate startTime;
    public LocalDate endTime;
    public String eventName;
    public String eventDetails;

    public Event(int eventID,
                 int capacity,
                 int remainingSeats,
                 LocalDate startTime,
                 LocalDate endTime,
                 String eventName,
                 String eventDetails) {

        this.eventID = eventID;
        this.capacity = capacity;
        this.remainingSeats = remainingSeats;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
    }

    public Event(int capacity, int remainingSeats, LocalDate startTime, LocalDate endTime, String eventName, String eventDetails) {
        this.capacity = capacity;
        this.remainingSeats = remainingSeats;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
    }
    public Event(){}
    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", capacity=" + capacity +
                ", remainingSeats=" + remainingSeats +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", eventName='" + eventName + '\'' +
                ", eventDetails='" + eventDetails + '\'' +
                '}';
    }
}
