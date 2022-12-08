package com.scticketing.ticketingwebsite.event;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {
    Optional<Event> findByEventId(long id);
}
