package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Event;
import at.htl.eventmanager.entity.Host;

import java.util.HashMap;
import java.util.List;

public class HostRepository {

    private static HostRepository instance;
    private final HashMap<Long, Host> hosts = new HashMap<>();

    public static HostRepository getInstance() {
        if (instance == null) {
            instance = new HostRepository();
        }

        return instance;
    }

    // add & update
    public Host save(Host host) {
        hosts.put(host.getId(), host);
        return host;
    }

    public void delete(long id) {
        hosts.remove(id);
    }

    public Host findById(long id) {
        return hosts.get(id);
    }

    public List<Host> findAll() {
        return List.copyOf(hosts.values());
    }

}
