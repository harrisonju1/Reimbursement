package Services;

import Beans.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoJdbc;

public class EmployeeService {
    private static EmployeeDao employeeDao = new EmployeeDaoJdbc();

    public Employee getEmployee(int id) {
        return employeeDao.getByEmployeeID(id);
    }

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

