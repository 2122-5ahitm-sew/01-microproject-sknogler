package at.htl.eventmanager.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Event extends PanacheEntity {

    public String name;
    public String date;
    private long id;

    public Event(String name, String date, long id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
