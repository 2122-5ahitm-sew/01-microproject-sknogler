package at.htl.eventmanager.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Event extends PanacheEntity {

    public String name;
    public String date;
    public long id;

    public Event(String name, String date, long id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public Event() {
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
