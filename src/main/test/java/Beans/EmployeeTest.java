package Beans;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    Employee test = new Employee("Harrison", "Ju", "harrisonju", "harrisonju",  0, 0, 0, 0);

    @Test
    public void getFirst_name() {
        assertEquals("Harrison", test.getFirst_name());
    }

    @Test
    public void setFirst_name() {
        String first_name = "Navroop";
        test.setFirst_name(first_name);
        assertEquals(first_name, test.getFirst_name());
    }

    @Test
    public void getLast_name() {
        assertEquals("Ju", test.getLast_name());
    }

    @Test
    public void setLast_name() {
        String last_name = "Hundal";
        test.setLast_name(last_name);
        assertEquals("Hundal", test.getLast_name());
    }

    @Test
    public void getUsername() {
        assertEquals("harrisonju", test.getUsername());
    }

    @Test
    public void setUsername() {
        String username = "admin";
        test.setUsername(username);
        assertEquals("admin", test.getUsername());
    }

    @Test
    public void getPassword() {
        assertEquals("harrisonju", test.getPassword());
    }

    @Test
    public void setPassword() {
        String password = "admin";
        test.setPassword(password);
        assertEquals("admin", test.getPassword());
    }

    @Test
    public void getClaim_id() {
        assertEquals(0, test.getClaim_id());
    }

    @Test
    public void setClaim_id() {
        int claim_id = 1;
        test.setClaim_id(claim_id);
        assertEquals(1, test.getClaim_id());
    }

    @Test
    public void getDepartmenthead_id() {
        assertEquals(0, test.getDepartmenthead_id());
    }

    @Test
    public void setDepartmenthead_id() {
        test.setDepartmenthead_id(1);
        assertEquals(1, test.getDepartmenthead_id());
    }

    @Test
    public void getSupervisor_id() {
        assertEquals(0, test.getSupervisor_id());
    }

    @Test
    public void setSupervisor_id() {
        test.setSupervisor_id(1);
        assertEquals(1, test.getSupervisor_id());
    }

    @Test
    public void getEmployee_id() {
        assertEquals(0, test.getEmployee_id());
    }

    @Test
    public void setEmployee_id() {
        test.setEmployee_id(1);
        assertEquals(1, test.getEmployee_id());
    }
}