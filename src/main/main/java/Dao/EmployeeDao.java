package Dao;

import java.util.*;
import Beans.Employee;

public interface EmployeeDao {
    Employee getByEmployeeID(int employee_id);
    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
