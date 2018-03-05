package Dao;

import Beans.Employee;
import Dao.EmployeeDaoJdbc;
import Dao.EmployeeDao;
import org.junit.Test;
import java.sql.*;
import java.util.*;


import static org.junit.Assert.*;

public class EmployeeDaoJdbcTest {

    @Test
    public void getByEmployeeID() {
        Employee employee = new Employee("Harrison","Ju", "harrisonju", "harrisonju", 1, 1, 1, 1);
        Employee test = new EmployeeDaoJdbc().getByEmployeeID(1);
        assertEquals(employee, test);
    }

    @Test
    public void createEmployee() {
        EmployeeDaoJdbc testItem = new EmployeeDaoJdbc();
        Employee employee = new Employee("Navroop","Hundal","navroop","navroop",2,1,1,2);
        testItem.createEmployee(employee);
        Employee test = new EmployeeDaoJdbc().getByEmployeeID(2);
        assertEquals(employee, test);
    }

    @Test
    public void updateEmployee() {
        EmployeeDaoJdbc testItem = new EmployeeDaoJdbc();
        Employee employee = new Employee("Noop","Hundal","navroop","navroop",2,1,1,2);
        testItem.updateEmployee(employee);
        Employee test = new EmployeeDaoJdbc().getByEmployeeID(2);
        assertEquals(employee, test);
    }

    @Test
    public void deleteEmployee() {
        EmployeeDaoJdbc testItem = new EmployeeDaoJdbc();
        Employee employee = new EmployeeDaoJdbc().getByEmployeeID(2);
        testItem.deleteEmployee(employee);
        assertEquals(testItem.getByEmployeeID(2), null);
    }
}