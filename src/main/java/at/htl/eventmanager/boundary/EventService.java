package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.entity.Event;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Path("/events")
public class EventService {

    private final EventRepository repository = EventRepository.getInstance();

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> findAll() {
        return repository.findAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Event findById(@PathParam("id") long id) {
        return Objects.requireNonNullElseGet(repository.findById(id), Event::new);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Event update(Event Event) {
        return save(Event);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Event add(Event Event) {
        return save(Event);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") long id) {
        repository.delete(id);
    }

    private Event save(Event Event) {
        return repository.save(Event);
    }

}
