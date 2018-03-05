package Services;

import Dao.EventsDaoJdbc;
import Dao.EventsDao;
import Beans.Events;
import Services.EmployeeService;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class EventsServiceTest {
    private static EventsDaoJdbc events = new EventsDaoJdbc();
    private static EventsService  service= new EventsService();
    Timestamp event_start = Timestamp.valueOf("2018-01-22 12:10:10");
    Timestamp event_end = Timestamp.valueOf("2018-01-22 12:10:10");
    Events event = new Events(2,"book",50, 100, 50, event_start, event_end, 0, null, "Harrison");


    @Test
    public void getByEvent() {
        Events test = service.getByEvent(0);
        assertEquals(event, test);
    }

    @Test
    public void createEvent() {
        service.createEvent(event);
        assertEquals(event, events.getByEventID(1));
    }

    @Test
    public void updateEvent() {
        service.updateEvent(event);
        assertEquals(event, events.getByEventID(2));
    }

    @Test
    public void deleteEvent() {
        service.deleteEvent(event);
        assertEquals(null, events.getByEventID(2));
    }
}