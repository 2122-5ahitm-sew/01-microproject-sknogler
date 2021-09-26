package at.htl.eventmanager.boundary;

import at.htl.eventmanager.controller.EventRepository;
import at.htl.eventmanager.controller.HostRepository;
import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;

@Path("/hosts")
public class HostService {

    @Inject
    private HostRepository repository;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host findById(@PathParam("id") long id) {
        return repository.findById(id);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Host update(Host host) {
        repository.update("id = " + host.id, host);
        return repository.findById(host.id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Host add(Host host) {
        repository.persist(host);
        return repository.findById(host.id);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public void delete(@PathParam("id") long id) {
        repository.delete(repository.findById(id));
    }
}
