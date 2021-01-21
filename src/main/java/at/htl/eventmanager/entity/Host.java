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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
