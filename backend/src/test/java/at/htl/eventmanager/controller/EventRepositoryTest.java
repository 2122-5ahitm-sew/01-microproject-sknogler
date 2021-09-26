package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*class EventRepositoryTest {

    EventRepository repository;
    Event event;

    @BeforeEach
    void beforeEach() {
        event = new Event("KonzertXY", "22.August.2020", 1);
        repository = new EventRepository();
    }

    @Test
    void addTest() {
        repository.save(event);
        assertThat(repository.events).hasSize(1);
    }

    @Test
    void getByIdTest() {
        repository.save(event);
        assertThat(repository.events.get(1L)).isEqualTo(event);
    }

    @Test
    void deleteTest() {
        repository.save(event);
        assertThat(repository.events).hasSize(1);

        repository.delete(1);
        assertThat(repository.events).hasSize(0);
    }

    @Test
    void findByIdTest() {
        repository.save(event);
        Event event2 = new Event("Comedian", "1.Jänner.2022", 2);
        repository.save(event2);
        assertThat(repository.events).hasSize(2);

        assertThat(repository.findById(2)).isEqualTo(event2);
    }

    @Test
    void findAllTest() {
        repository.save(event);
        Event event2 = new Event("Comedian", "1.Jänner.2022", 2);
        repository.save(event2);

        repository.listAll();
        assertThat(repository.listAll().size());
    }
}
 */