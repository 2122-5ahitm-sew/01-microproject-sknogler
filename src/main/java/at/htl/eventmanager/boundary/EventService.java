package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.entity.Event;

import javax.inject.Inject;
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
        return findAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Event findById(@PathParam("id") long id) {
        return findById(id);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Event update(Event event) {
        return update(event);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Event add(Event event) {
        return add(event);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") long id) {
        delete(id);
    }

    private Event save(Event event) {
        return save(event);
    }
}
