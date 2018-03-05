package Services;

import org.junit.Test;
import Services.ClaimsService;
import Beans.Claims;
import Dao.ClaimsDao;
import Dao.ClaimsDaoJdbc;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class ClaimsServiceTest {
    private static ClaimsDao claimsDao = new ClaimsDaoJdbc();
    private static ClaimsService service = new ClaimsService();

    @Test
    public void getClaim() {
        Claims claim = service.getClaim(1);
        assertNotNull(claim);
    }

    @Test
    public void createClaim() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        ClaimsDaoJdbc testItem = new ClaimsDaoJdbc();
        Claims claim = new Claims(2,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, "newstring");
        service.createClaim(claim);
        assertNotNull(claimsDao.getByClaimID(2));
    }

    @Test
    public void updateClaim() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims claim = new Claims(1,supervisor_approval_date, false, department_approval_date, true, benco_approval_date, true, "newstring");
        service.updateClaim(claim);
        assertEquals(claim,claimsDao.getByClaimID(1));
    }

    @Test
    public void deleteClaim() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims claim = new Claims(2,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, "newstring");
        service.deleteClaim(claim);
        assertEquals(null, claimsDao.getByClaimID(2));
    }
}