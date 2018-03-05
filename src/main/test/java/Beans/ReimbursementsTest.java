package Beans;

import org.junit.Test;
import java.sql.*;

import static org.junit.Assert.*;

public class ReimbursementsTest {
    Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
    Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
    Reimbursements test = new Reimbursements(0, "book", 0, claim_created, claim_resolved,0 );

    @Test
    public void getEventID() {
        assertEquals(0, test.getEventID());
    }

    @Test
    public void setEventID() {
        test.setEventID(1);
        assertEquals(1, test.getEventID());
    }

    @Test
    public void getReimbursementType() {
        assertEquals("book", test.getReimbursementType());
    }

    @Test
    public void setReimbursementType() {
        test.setReimbursementType("test");
        assertEquals("test",test.getReimbursementType());
    }

    @Test
    public void getClaimID() {
        assertEquals(0, test.getClaimID());
    }

    @Test
    public void setClaimID() {
        test.setClaimID(1);
        assertEquals(1, test.getClaimID());
    }

    @Test
    public void getClaimCreated() {
        assertEquals(claim_created, test.getClaimCreated());
    }

    @Test
    public void setClaimCreated() {
        claim_created = null;
        assertEquals(null, test.getClaimCreated());
    }

    @Test
    public void getClaimResolved() {
        assertEquals(claim_resolved,test.getClaimResolved());
    }

    @Test
    public void setClaimResolved() {
        claim_resolved = null;
        assertEquals(null, test.getClaimResolved());
    }
}