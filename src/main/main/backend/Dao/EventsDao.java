package backend.Dao;
import backend.Beans.Events;

public interface EventsDao {
    Events getByEventID(int events_id);
    void createEvent(Events event);
    void updateEvent(Events event);
    void deleteEvent(Events event);
}
