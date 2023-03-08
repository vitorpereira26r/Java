package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry{

    private String name;
    private Date moment;

    public LogEntry(String name, Date moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;
        return Objects.equals(getName(), logEntry.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
