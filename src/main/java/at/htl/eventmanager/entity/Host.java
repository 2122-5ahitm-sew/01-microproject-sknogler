package at.htl.eventmanager.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Host extends PanacheEntity {

    public String name;
    public long ssn;
    public long id;

    public Host(String name, long ssn, long id) {
        this.name = name;
        this.ssn = ssn;
        this.id = id;
    }

    public Host() {
    }

    @Override
    public String toString() {
        return "Host{" +
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                ", id=" + id +
                '}';
    }
}
