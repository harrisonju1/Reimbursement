package java.Services;

import java.Beans.Employee;
import java.Dao.EmployeeDao;
import java.Dao.EmployeeDaoJdbc;

public class EmployeeService {
    private static EmployeeDao employeeDao = new EmployeeDaoJdbc();

    public Employee getEmployeeByID(int id) {
        return employeeDao.getByEmployeeID(id);
    }

    public Employee getEmployeeByUsername(String username){return employeeDao.getByEmployeeUsername(username);}

    public void createEmployee(Employee employee) {
        employeeDao.createEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }
}

