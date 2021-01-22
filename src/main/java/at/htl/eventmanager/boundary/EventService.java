package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.entity.Event;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Path("/events")
public class EventService {

    @Inject
    private EventRepository repository;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Event findById(@PathParam("id") long id) {
        return repository.findById(id);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Event update(Event event) {
        repository.update("id = " + event.id, event);
        return repository.findById(event.id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Event add(Event event) {
        repository.persist(event);
        return repository.findById(event.id);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public void delete(@PathParam("id") long id) {
        repository.delete(repository.findById(id));
    }
}
