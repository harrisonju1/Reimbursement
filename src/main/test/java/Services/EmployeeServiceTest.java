package Services;

import Dao.EmployeeDao;
import Dao.EmployeeDaoJdbc;
import Beans.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {
    private static EmployeeDao employeeDao = new EmployeeDaoJdbc();
    private static EmployeeService  service= new EmployeeService();
    @Test
    public void getEmployee() {
        service.getEmployee(1);
        assertNotNull(employeeDao.getByEmployeeID(1));
    }

    @Test
    public void createEmployee() {
        Employee employee = new Employee("Harrison","Ju", "harrisonju", "harrisonju", 1, 1, 1, 1);
        service.createEmployee(employee);
        assertNotNull(employeeDao.getByEmployeeID(1));
    }

    @Test
    public void updateEmployee() {
        Employee employee = new Employee("Navroop","Ju", "harrisonju", "harrisonju", 1, 1, 1, 1);
        service.updateEmployee(employee);
        assertEquals("Navroop", employeeDao.getByEmployeeID(1).getFirst_name());
    }

    @Test
    public void deleteEmployee() {
        Employee employee = new Employee("Navroop","Ju", "harrisonju", "harrisonju", 1, 1, 1, 1);
        service.deleteEmployee(employee);
        assertEquals(null, employeeDao.getByEmployeeID(1));
    }
}