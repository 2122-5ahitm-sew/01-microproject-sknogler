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
public class HostRepository implements PanacheRepository<Host> {

    public static HostRepository instance;
    HashMap<Long, Host> hosts = new HashMap<>();

    public static HostRepository getInstance() {
        if (instance == null) {
            instance = new HostRepository();
        }

        return instance;
    }
}
