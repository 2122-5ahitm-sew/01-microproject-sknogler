package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;

import java.util.HashMap;
import java.util.List;

public class EventRepository {

    private static EventRepository instance;
    private final HashMap<Long, Event> events = new HashMap<>();

    public static EventRepository getInstance() {
        if (instance == null) {
            instance = new EventRepository();
        }

        return instance;
    }

    // add & update
    public Event save(Event event) {
        events.put(event.getId(), event);
        return event;
    }

    public void delete(Event product) {
        events.remove(product.getId());
    }

    public Event findById(long id) {
        return events.get(id);
    }

    public List<Event> findAll() {
        return List.copyOf(events.values());
    }

}
