package Dao;

import org.junit.Test;
import Beans.Reimbursements;
import java.sql.*;
import java.util.*;


import static org.junit.Assert.*;

public class ReimbursementsDaoJdbcTest {

    @Test
    public void getByEventID() {
        Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
        Reimbursements reimbursements = new Reimbursements(0, "book", 0, claim_created, claim_resolved,0 );
        Reimbursements test = new ReimbursementsDaoJdbc().getByEventID(0);
        assertEquals(test, reimbursements);

    }

    @Test
    public void getByClaimID() {
        Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
        Reimbursements reimbursements = new Reimbursements(0, "book", 0, claim_created, claim_resolved,0 );
        Reimbursements test = new ReimbursementsDaoJdbc().getByClaimID(0);
        assertEquals(test, reimbursements);
    }

    @Test
    public void getByEmployeeID(){
        Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
        Reimbursements reimbursements = new Reimbursements(0, "book", 0, claim_created, claim_resolved,0 );
        ArrayList<Reimbursements> expected = new ArrayList<>();
        expected.add(reimbursements);
        ArrayList<Reimbursements> test = new ReimbursementsDaoJdbc().getByEmployeeID(0);
        assertEquals(expected, test);
    }

    @Test
    public void createReimbursement() {
        ReimbursementsDaoJdbc testItem = new ReimbursementsDaoJdbc();
        Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
        Reimbursements reimbursement = new Reimbursements(0,"book",1,claim_created, claim_resolved, 0);
        testItem.createReimbursement(reimbursement);
        Reimbursements test = new ReimbursementsDaoJdbc().getByClaimID(1);
        assertEquals(reimbursement, test);
    }

    @Test
    public void updateReimbursement() {
        ReimbursementsDaoJdbc testItem = new ReimbursementsDaoJdbc();
        Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
        Reimbursements reimbursement = new Reimbursements(0,"book",1,claim_created, claim_resolved, 0);
        testItem.updateReimbursement(reimbursement);
        Reimbursements test = new ReimbursementsDaoJdbc().getByClaimID(1);
        assertEquals(reimbursement, test);
    }

    @Test
    public void deleteReimbursementByEventID() {
        ReimbursementsDaoJdbc testItem = new ReimbursementsDaoJdbc();
        Reimbursements reimbursements = new ReimbursementsDaoJdbc().getByClaimID(1);
        testItem.deleteReimbursement(reimbursements);
        assertEquals(testItem.getByClaimID(1), null);
    }
}