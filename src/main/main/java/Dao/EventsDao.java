package Dao;
import Beans.Events;
import java.util.*;

public interface EventsDao {
    Events getByEventID(int events_id);
    void createEvent(Events event);
    void updateEvent(Events event);
    void deleteEvent(Events event);
}
