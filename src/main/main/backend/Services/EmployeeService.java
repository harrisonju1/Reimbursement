package backend.Services;

import backend.Beans.Employee;
import backend.Dao.EmployeeDao;
import backend.Dao.EmployeeDaoJdbc;

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

