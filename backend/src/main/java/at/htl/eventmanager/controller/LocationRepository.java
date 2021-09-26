package at.htl.eventmanager.controller;

import at.htl.eventmanager.entity.Host;
import at.htl.eventmanager.entity.Location;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;

@ApplicationScoped
public class LocationRepository implements PanacheRepository<Location> {

    public static LocationRepository instance;
    HashMap<Long, Location> locations = new HashMap<>();

    public static LocationRepository getInstance() {
        if (instance == null) {
            instance = new LocationRepository();
        }

        return instance;
    }
}
