package backend.Beans;

import java.util.*;

public class Employee {
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private int claim_id;
    private int departmenthead_id;
    private int supervisor_id;
    private int employee_id;

    public Employee(String first_name, String last_name, String username, String password, int claim_id, int departmenthead_id, int supervisor_id, int employee_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.claim_id = claim_id;
        this.departmenthead_id = departmenthead_id;
        this.supervisor_id = supervisor_id;
        this.employee_id = employee_id;
    }

    public Employee(){

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(int claim_id) {
        this.claim_id = claim_id;
    }

    public int getDepartmenthead_id() {
        return departmenthead_id;
    }

    public void setDepartmenthead_id(int departmenthead_id) {
        this.departmenthead_id = departmenthead_id;
    }

    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return claim_id == employee.claim_id &&
                departmenthead_id == employee.departmenthead_id &&
                supervisor_id == employee.supervisor_id &&
                employee_id == employee.employee_id &&
                Objects.equals(first_name, employee.first_name) &&
                Objects.equals(last_name, employee.last_name) &&
                Objects.equals(username, employee.username) &&
                Objects.equals(password, employee.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(first_name, last_name, username, password, claim_id, departmenthead_id, supervisor_id, employee_id);
    }
}
