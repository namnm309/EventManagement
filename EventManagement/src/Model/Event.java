package Model;

public class Event {

    private String nameEvent;
    private String date;
    private String location;
    private int numberOfAttendees;
    private String status;

    public Event(String nameEvent, String date, String location, int numberOfAttendees, String status) {
        this.nameEvent = nameEvent;
        this.date = date;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
        this.status = status;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
