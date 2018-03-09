package backend.Services;

import backend.Beans.Events;
import backend.Dao.EventsDao;
import backend.Dao.EventsDaoJdbc;

public class EventsService {
    private static EventsDao eventsDao = new EventsDaoJdbc();

    public Events getByEvent(int id){
        return eventsDao.getByEventID(id);
    }

    public Events getByUsername(String username) {return eventsDao.getByUsername(username);}

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
