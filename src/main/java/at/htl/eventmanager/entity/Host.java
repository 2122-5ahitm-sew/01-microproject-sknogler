package at.htl.eventmanager.entity;

public class Host {

    private String name;
    private long ssn;
    private long id;

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
