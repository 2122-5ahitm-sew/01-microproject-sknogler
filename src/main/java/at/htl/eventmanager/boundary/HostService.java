package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.controller.HostRepository;
import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Path("/events")
public class HostService {

    @Inject
    private HostRepository repository;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> findAll() {
        return findAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host findById(@PathParam("id") long id) {
        return findById(id);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host update(Host host) {
        return update(host);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host add(Host host) {
        return add(host);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") long id) {
        delete(id);
    }

    private Host save(Host host) {
        return save(host);
    }
}
