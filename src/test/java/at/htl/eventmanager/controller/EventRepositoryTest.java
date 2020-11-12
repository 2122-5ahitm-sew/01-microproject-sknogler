package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EventRepositoryTest {

    EventRepository repository;
    Event event;

    @BeforeEach
    void beforeEach(){
        event = new Event("KonzertXY", "22.August.2020", 1);
        repository = new EventRepository();
    }

    @Test
    void addTest(){
        repository.save(event);
        assertThat(repository.events).hasSize(1);
    }
}