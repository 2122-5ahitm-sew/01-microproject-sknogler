package at.htl.eventmanager.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Location extends PanacheEntity {

    public String locationName;
    public String address;
    public long locationID;

    public Location(String name, String address, long id) {
        this.locationName = name;
        this.address = address;
        this.locationID = id;
    }

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "loactionName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", locationID=" + locationID +
                '}';
    }
}
