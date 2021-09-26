package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class EventRepository implements PanacheRepository<Event> {

    public static EventRepository instance;
    HashMap<Long, Event> events = new HashMap<>();

    public static EventRepository getInstance() {
        if (instance == null) {
            instance = new EventRepository();
        }

        return instance;
    }
}
