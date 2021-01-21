package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.ApplicationPath;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class HostRepository implements PanacheRepository {

    public static HostRepository instance;
    HashMap<Long, Host> hosts = new HashMap<>();

    public static HostRepository getInstance() {
        if (instance == null) {
            instance = new HostRepository();
        }

        return instance;
    }

    // add & update
    @Transactional
    public Host save(Host host) {
        hosts.put(host.getId(), host);
        return host;
    }

    @Transactional
    public void delete(long id) {
        hosts.remove(id);
    }

    public Host findById(long id) {
        return hosts.get(id);
    }

    public List<Host> listAll() {
        return new ArrayList<Host>(hosts.values());
    }

}
