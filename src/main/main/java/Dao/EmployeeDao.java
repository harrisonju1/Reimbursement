package java.Dao;

import java.util.*;
import java.Beans.Employee;

public interface EmployeeDao {
    Employee getByEmployeeID(int employee_id);
    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
