package java.Dao;

import java.Beans.Employee;
import java.util.*;
import java.sql.*;

public class EmployeeDaoJdbc implements EmployeeDao{
    private static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();

    @Override
    public Employee getByEmployeeID(int employee_id) {
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM employee WHERE employee_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,employee_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Employee> employee = new ArrayList<>();
            while (results.next()){
                String first_name = results.getString("first_name");
                String last_name = results.getString("last_name");
                String username = results.getString("username");
                String password = results.getString("password");
                int claim_id = results.getInt("claim_id");
                int departmenthead_id  = results.getInt("departmenthead_id");
                int supervisor_id = results.getInt("supervisor_id");
                employee_id = results.getInt("employee_id");

//                employee.add(new Employee(first_name, last_name,username, password, claim_id, departmenthead_id, supervisor_id, employee_id));
                Employee employee = new Employee(first_name, last_name,username,password,claim_id,departmenthead_id,supervisor_id,employee_id);
                return employee;
            }

//            return employee;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Employee getByEmployeeUsername(String username){
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM employee WHERE username = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setString(1,username);

            ResultSet results = ps.executeQuery();
//            ArrayList<Employee> employee = new ArrayList<>();
            while (results.next()){
                String first_name = results.getString("first_name");
                String last_name = results.getString("last_name");
                username = results.getString("username");
                String password = results.getString("password");
                int claim_id = results.getInt("claim_id");
                int departmenthead_id  = results.getInt("departmenthead_id");
                int supervisor_id = results.getInt("supervisor_id");
                int employee_id = results.getInt("employee_id");

//                employee.add(new Employee(first_name, last_name,username, password, claim_id, departmenthead_id, supervisor_id, employee_id));
                Employee employee = new Employee(first_name, last_name,username,password,claim_id,departmenthead_id,supervisor_id,employee_id);
                return employee;
            }

//            return employee;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createEmployee(Employee employee) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "INSERT INTO employee (first_name, last_name, username," + "password, claim_id, departmenthead_id, supervisor_id, employee_id) VALUES " + "(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, employee.getFirst_name());
            ps.setString(2, employee.getLast_name());
            ps.setString(3, employee.getUsername());
            ps.setString(4, employee.getPassword());
            ps.setInt(5,employee.getClaim_id());
            ps.setInt(6, employee.getDepartmenthead_id());
            ps.setInt(7, employee.getSupervisor_id());
            ps.setInt(8, employee.getEmployee_id());

            ResultSet results =ps.executeQuery();
            if (results.next()){
                employee.setEmployee_id(results.getInt("employee_id"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "UPDATE employee SET first_name = ?, last_name = ?, username = ?, password = ?, claim_id = ?, departmenthead_id" +
                    "=?, supervisor_id = ? WHERE employee_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, employee.getFirst_name());
            ps.setString(2, employee.getLast_name());
            ps.setString(3, employee.getUsername());
            ps.setString(4, employee.getPassword());
            ps.setInt(5,employee.getClaim_id());
            ps.setInt(6, employee.getDepartmenthead_id());
            ps.setInt(7, employee.getSupervisor_id());
            ps.setInt(8, employee.getEmployee_id());

            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "DELETE FROM employee WHERE employee_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,employee.getEmployee_id());

            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
