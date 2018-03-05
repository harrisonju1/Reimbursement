package java.Services;

import java.Beans.Events;
import java.Dao.EventsDao;
import java.Dao.EventsDaoJdbc;
import java.util.*;

public class EventsService {
    private static EventsDao eventsDao = new EventsDaoJdbc();

    public Events getByEvent(int id){
        return eventsDao.getByEventID(id);
    }

    public void createEvent(Events event){
        eventsDao.createEvent(event);
    }

    public void updateEvent(Events event){
        eventsDao.updateEvent(event);
    }

    public void deleteEvent(Events event){
        eventsDao.deleteEvent(event);
    }
}
