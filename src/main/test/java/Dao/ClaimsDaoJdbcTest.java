package Dao;
import Beans.Claims;
import Dao.ClaimsDao;
import Dao.ClaimsDaoJdbc;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

public class ClaimsDaoJdbcTest{


    @Test
    public void getByClaimID() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims claim = new Claims(1,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        Claims test = new ClaimsDaoJdbc().getByClaimID(1);
        assertEquals(claim, test);
    }

    @Test
    public void createClaim() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        ClaimsDaoJdbc testItem = new ClaimsDaoJdbc();
        Claims claim = new Claims(1,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        Claims create = new Claims(1,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        testItem.createClaim(create);
        Claims test = new ClaimsDaoJdbc().getByClaimID(1);
        assertEquals(claim, test);
    }

    @Test
    public void updateClaim() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        ClaimsDaoJdbc testItem = new ClaimsDaoJdbc();
        Claims claim = new Claims(1,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, "newstring");
        Claims test = new Claims(1,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, "newstring");
        testItem.updateClaim(test);
        assertEquals(claim, test);
    }


    @Test
    public void deleteClaim() {
        ClaimsDaoJdbc test = new ClaimsDaoJdbc();
        Claims claim = new ClaimsDaoJdbc().getByClaimID(1);
        test.deleteClaim(claim);
        assertEquals(test.getByClaimID(1), null);
    }
}