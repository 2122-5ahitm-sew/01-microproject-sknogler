package at.htl.eventmanager.entity;

import java.util.Date;

public class Event {

    private String name;
    private Date date;
    private long id;

    public Event(String name, Date date, long id) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
