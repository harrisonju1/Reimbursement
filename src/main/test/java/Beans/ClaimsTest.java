package Beans;
import Beans.Claims;

import org.junit.Test;
import java.sql.*;
import java.util.*;

import static org.junit.Assert.*;

public class ClaimsTest {

    @Test
    public void getClaimID() {
        Claims claim = new Claims();
        claim.setClaimID(0);
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(claim.getClaimID(), test.getClaimID());
    }

    @Test
    public void setClaimID() {
        Claims test = new Claims();
        test.setClaimID(1);
        assertEquals(test.getClaimID(), 1);
    }

    @Test
    public void getSupervisorApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(supervisor_approval_date, test.getSupervisorApprovalDate());
    }

    @Test
    public void setSupervisorApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setSupervisorApprovalDate(supervisor_approval_date);
        assertEquals(supervisor_approval_date, test.getSupervisorApprovalDate());
    }

    @Test
    public void getSupervisorApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(true, test.getSupervisorApproval());
    }

    @Test
    public void setSupervisorApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        test.setSupervisorApproval(false);
        assertEquals(false, test.getSupervisorApproval());
    }

    @Test
    public void getDepartmentApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setDepartmentApprovalDate(department_approval_date);
        assertEquals(department_approval_date, test.getDepartmentApprovalDate());
    }

    @Test
    public void setDepartmentApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(true, test.getDepartmentApprovalDate());
    }

    @Test
    public void setDepartmentApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(true, test.getDepartmentApproval());
    }

    @Test
    public void getDepartmentApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,supervisor_approval_date, true, department_approval_date, true, benco_approval_date, true, null);
        assertEquals(true, test.getDepartmentApproval());
    }

    @Test
    public void getBencoApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoApprovalDate(benco_approval_date);
        assertEquals(department_approval_date, test.getBencoApprovalDate());
    }

    @Test
    public void setBencoApprovalDate() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoApprovalDate(benco_approval_date);
        assertEquals(department_approval_date, test.getBencoApprovalDate());
    }

    @Test
    public void getBencoApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoApproval(false);
        assertEquals(false, test.getBencoApproval());
    }
    @Test
    public void setBencoApproval() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoApproval(false);
        assertEquals(false, test.getBencoApproval());
    }

    @Test
    public void getBencoDenyReason() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoDenyReason("no reason");
        assertEquals("no reason", test.getBencoDenyReason());
    }

    @Test
    public void setBencoDenyReason() {
        Timestamp supervisor_approval_date = Timestamp.valueOf("2018-01-22 12:10:10");
        Timestamp department_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Timestamp benco_approval_date = Timestamp.valueOf("2018-01-23 12:10:10");
        Claims test = new Claims(0,null, true, department_approval_date, true, benco_approval_date, true, null);
        test.setBencoDenyReason("no reason");
        assertEquals("no reason", test.getBencoDenyReason());
    }
}