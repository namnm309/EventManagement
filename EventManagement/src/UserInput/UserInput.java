package UserInput;

import Model.Event;

public interface UserInput {

    public Event input();

    public void createEvent();

    public void searchEvent();

    public void updateEvent();

    public void saveEvent();

    public void printEvent();
}
