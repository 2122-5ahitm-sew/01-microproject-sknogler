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

    @Test
    void getByIdTest() {
        repository.save(host);
        assertThat(repository.hosts.get(1L)).isEqualTo(host);
    }

    @Test
    void deleteTest() {
        repository.save(host);
        assertThat(repository.hosts).hasSize(1);

        repository.delete(1);
        assertThat(repository.hosts).hasSize(0);
    }

    @Test
    void findByIdTest() {
        repository.save(host);
        Host host2 = new Event("Herr Müller", 333333, 2);
        repository.save(host2);
        assertThat(repository.hosts).hasSize(2);

        assertThat(repository.findById(2)).isEqualTo(host2);
    }
}