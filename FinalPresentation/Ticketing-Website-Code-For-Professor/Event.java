package com.scticketing.ticketingwebsite.event;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="events")
public class Event {

    @Id
    @SequenceGenerator(
            name = "event_sequence",
            sequenceName = "event_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "event_sequence"
    )
    private long eventId;


    public String foreGroundImageUrl;
    public String backGroundImageUrl;
    public int capacity;
    public int remainingSeats;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public LocalDate startTime;
    public String eventName;
    @Column(length = 2048)
    public String eventDetails;
    public double price;
    public String eventLocation;

    // Create list for attendants

    public Event(long eventId,
                 int capacity,
                 LocalDate startTime,
                 String eventName,
                 String eventDetails,
                 double price) {

        this.eventId = eventId;
        this.capacity = capacity;
        this.remainingSeats = capacity;
        this.startTime = startTime;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
        this.price = price;
    }

    public Event(int capacity, LocalDate startTime, String eventName, String eventDetails, double price) {
        this.capacity = capacity;
        this.remainingSeats = capacity;
        this.startTime = startTime;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
        this.price = price;
    }

    public Event(String foreGroundImageUrl,
                 String backGroundImageUrl,
                 int capacity, LocalDate startTime,
                 String eventName,
                 String eventDetails,
                 double price,
                 String eventLocation) {
        this.foreGroundImageUrl = foreGroundImageUrl;
        this.backGroundImageUrl = backGroundImageUrl;
        this.capacity = capacity;
        this.startTime = startTime;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
        this.price = price;
        this.eventLocation = eventLocation;
    }

    public Event(){}
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventID) {
        this.eventId = eventID;
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

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public String getForeGroundImageUrl() {
        return foreGroundImageUrl;
    }

    public void setForeGroundImageUrl(String foreGroundImageUrl) {
        this.foreGroundImageUrl = foreGroundImageUrl;
    }

    public String getBackGroundImageUrl() {
        return backGroundImageUrl;
    }

    public void setBackGroundImageUrl(String backGroundImageUrl) {
        this.backGroundImageUrl = backGroundImageUrl;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventId +
                ", capacity=" + capacity +
                ", remainingSeats=" + remainingSeats +
                ", startTime=" + startTime +
                ", eventName='" + eventName + '\'' +
                ", eventDetails='" + eventDetails + '\'' +
                '}';
    }
}
