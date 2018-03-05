package Services;

import Dao.ReimbursementsDao;
import Dao.ReimbursementsDaoJdbc;
import org.junit.Test;
import Beans.Reimbursements;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class ReimbursementsServiceTest {
    private static ReimbursementsDao reimbursementsDao= new ReimbursementsDaoJdbc();
    Timestamp claim_created = Timestamp.valueOf("2018-01-22 12:10:10");
    Timestamp claim_resolved = Timestamp.valueOf("2018-01-23 12:10:10");
    Reimbursements test = new Reimbursements(0, "book", 0, claim_created, claim_resolved,0 );


    @Test
    public void getEventByID() {
        ReimbursementsService service = new ReimbursementsService();
        Reimbursements newTest = service.getEventByID(1);
        assertNotNull(newTest);
    }

    @Test
    public void getClaimByID() {
        ReimbursementsService service = new ReimbursementsService();
        Reimbursements newTest = service.getClaimByID(1);
        assertNotNull(newTest);
    }

    @Test
    public void createReimbursement() {
        ReimbursementsService service =new ReimbursementsService();
        Reimbursements newItem = new Reimbursements(1, "book", 1, claim_created, claim_resolved,0 );

        service.createReimbursement(newItem);
        assertEquals(test, reimbursementsDao.getByEventID(1));
    }

    @Test
    public void updateReimbursement() {
        ReimbursementsService service = new ReimbursementsService();
        Reimbursements newItem = new Reimbursements(1,"test",1,claim_created,claim_resolved,0);
        service.updateReimbursement(newItem);
        assertEquals(newItem, reimbursementsDao.getByEventID(1));
    }

    @Test
    public void deleteReimbursementByEventID() {
        ReimbursementsService service = new ReimbursementsService();
        Reimbursements newItem = new Reimbursements(1,"test",1,claim_created,claim_resolved,0);
        service.deleteReimbursement(newItem);
        assertNull(reimbursementsDao.getByEventID(1));
    }
}