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
public class EventRepository implements PanacheRepository {

    private static EventRepository instance;
    HashMap<Long, Event> events = new HashMap<>();

    public static EventRepository getInstance() {
        if (instance == null) {
            instance = new EventRepository();
        }

        return instance;
    }

    // add & update
    @Transactional
    public Event save(Event event) {
        events.put(event.getId(), event);
        return event;
    }

    @Transactional
    public void delete(long id) {
        events.remove(id);
    }

    public Event findById(long id) {
        return events.get(id);
    }

    public List<Event> listAll() {
        return new ArrayList<Event>(events.values());
    }

}
