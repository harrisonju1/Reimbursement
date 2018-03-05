package Beans;

import org.junit.Test;
import java.sql.*;

import static org.junit.Assert.*;

public class EventsTest {
    Timestamp event_start = Timestamp.valueOf("2018-01-22 12:10:10");
    Timestamp event_end = Timestamp.valueOf("2018-01-22 12:10:10");
    Events event = new Events(0,"book",50, 100, 50, event_start, event_end, 0, null, "Harrison");


    @Test
    public void getEventID() {
        assertEquals(0, event.getEventID());
    }

    @Test
    public void setEventID() {
        event.setEventID(1);
        assertEquals(1, event.getEventID());
    }

    @Test
    public void getReimbursementType() {
        assertEquals("book", event.getReimbursementType());
    }

    @Test
    public void setReimbursementType() {
        event.setReimbursementType("hello");
        assertEquals("hello", event.getReimbursementType());
    }

    @Test
    public void getCost() {
        assertEquals(50, event.getCost(), 0);
    }

    @Test
    public void setCost() {
        event.setCost(100.0);
        assertEquals(100.0, event.getCost(), 0);
    }

    @Test
    public void getGrade() {
        assertEquals(100, event.getGrade());
    }

    @Test
    public void setGrade() {
        event.setGrade(50);
        assertEquals(50,event.getGrade());
    }

    @Test
    public void getGradeToPass() {
        assertEquals(50, event.getGradeToPass());
    }

    @Test
    public void setGradeToPass() {
        event.setGradeToPass(75);
        assertEquals(75, event.getGradeToPass());
    }

    @Test
    public void getEventStart() {
        assertEquals(event_start, event.getEventStart());
    }

    @Test
    public void setEventStart() {
        event.setEventStart(null);
        assertEquals(null, event.getEventStart());
    }

    @Test
    public void getEventEnd() {
        assertEquals(event_end, event.getEventEnd());
    }

    @Test
    public void setEventEnds() {
        event.setEventEnds(null);
        assertEquals(null,event.getEventEnd());
    }

    @Test
    public void getStatus() {
        assertEquals(0, event.getStatus());
    }

    @Test
    public void setStatus() {
        event.setStatus(1);
        assertEquals(1, event.getStatus());
    }

    @Test
    public void getAttachments() {
        assertEquals(null, event.getAttachments());
    }

    @Test
    public void setAttachments() {
        byte[] bytes = {};
        event.setAttachments(bytes);
        assertEquals("", event.getAttachments());
    }

    @Test
    public void getName() {
        assertEquals("Harrison", event.getName());
    }

    @Test
    public void setName() {
        event.setName("Jarrison");
        assertEquals("Jarrison", event.getName());
    }
}