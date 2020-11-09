package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.controller.HostRepository;
import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Path("/events")
public class HostService {

    private final HostRepository repository = HostRepository.getInstance();

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> findAll() {
        return repository.findAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host findById(@PathParam("id") long id) {
        return Objects.requireNonNullElseGet(repository.findById(id), Host::new);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host update(Host Host) {
        return save(Host);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host add(Host Host) {
        return save(Host);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") long id) {
        repository.delete(id);
    }

    private Host save(Host Host) {
        return repository.save(Host);
    }

}
