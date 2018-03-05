package Dao;

import Beans.Events;
import Dao.EventsDaoJdbc;
import Dao.EventsDao;
import org.junit.Test;
import java.sql.*;
import java.util.*;

import static org.junit.Assert.*;

public class EventsDaoJdbcTest {

    @Test
    public void getByEventID() {
        Timestamp event_start = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp event_end = Timestamp.valueOf("2018-01-22 12:10:10");
        Events event = new Events(0,"book",50, 100, 50, event_start, event_end, 0, null, "Harrison");
        Events test = new EventsDaoJdbc().getByEventID(0);
        assertEquals(event,test);

    }
    @Test
    public void createEvent() {
        EventsDaoJdbc testItem = new EventsDaoJdbc();
        Timestamp event_start = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp event_end = Timestamp.valueOf("2018-01-23 12:10:10");
        Events event = new Events(1,"book",50, 100, 50, event_start,event_end,0,null,"Harrison");
        testItem.createEvent(event);
        Events test = new EventsDaoJdbc().getByEventID(1);
        assertEquals(event,test);
    }

    @Test
    public void updateEvent() {
        Timestamp event_start = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp event_end = Timestamp.valueOf("2018-01-23 12:10:10");
        EventsDaoJdbc testItem = new EventsDaoJdbc();
        Events event = new Events(1,"book",50, 100, 50, event_start,event_end,1,null,"Harrison");
        testItem.updateEvent(event);
        Events test = new EventsDaoJdbc().getByEventID(1);
        assertEquals(event,test);
    }

    @Test
    public void deleteEvent() {
        EventsDaoJdbc testItem = new EventsDaoJdbc();
        Events event = new EventsDaoJdbc().getByEventID(1);
        testItem.deleteEvent(event);
        assertEquals(testItem.getByEventID(1), null);
    }
}