package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class HostRepositoryTest {

    HostRepository repository;
    Host host;

    @BeforeEach
    void beforeEach() {
        host = new Host("Herr Huber", 222222, 2);
        repository = new HostRepository();
    }

    @Test
    void addTest() {
        repository.save(host);
        assertThat(repository.hosts).hasSize(1);
    }

}