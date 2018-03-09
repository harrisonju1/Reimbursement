package backend.Dao;
import backend.Beans.Events;

public interface EventsDao {
    Events getByEventID(int events_id);
    Events getByUsername(String username);
    void createEvent(Events event);
    void updateEvent(Events event);
    void deleteEvent(Events event);
}
