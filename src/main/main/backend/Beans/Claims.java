package backend.Beans;

import backend.Beans.Events;
import java.util.*;
import java.sql.*;

public class Claims {
    private int claim_id;
    private int event_id;
    private String reimbursement_type;
    private int grade;
    private int grade_to_pass;
    private Timestamp supervisor_approval_date;
    private boolean supervisor_approval;
    private Timestamp department_approval_date;
    private boolean department_approval;
    private Timestamp benco_approval_date;
    private boolean benco_approval;
    private String benco_deny_reason;

    public Claims(int claim_id, int event_id, String reimbursement_type, int grade, int grade_to_pass, Timestamp supervisor_approval_date, boolean supervisor_approval, Timestamp department_approval_date,
                  boolean department_approval, Timestamp benco_approval_date, boolean benco_approval, String benco_deny_reason) {
        this.claim_id = claim_id;
        this.event_id = event_id;
        this.reimbursement_type = reimbursement_type;
        this.grade = grade;
        this.grade_to_pass = grade_to_pass;
        this.supervisor_approval_date = supervisor_approval_date;
        this.supervisor_approval = supervisor_approval;
        this.department_approval_date = department_approval_date;
        this.department_approval = department_approval;
        this.benco_approval_date = benco_approval_date;
        this.benco_approval = benco_approval;
        this.benco_deny_reason = benco_deny_reason;
    }

    public Claims() {
        this.claim_id = -1;
        this.event_id = -1;
        this.reimbursement_type = null;
        this.grade = 0;
        this.grade_to_pass = 0;
        this.supervisor_approval_date = null;
        this.supervisor_approval = false;
        this.department_approval_date = null;
        this.department_approval = false;
        this.benco_approval_date = null;
        this.benco_approval = false;
        this.benco_deny_reason = null;
    }

    public int getClaim_id() {
        return claim_id;
    }
    public void setClaim_id(int claim_id) {
        this.claim_id = claim_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getReimbursement_type() {
        return reimbursement_type;
    }

    public void setReimbursement_type(String reimbursement_type) {
        this.reimbursement_type = reimbursement_type;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade_to_pass() {
        return grade_to_pass;
    }

    public void setGrade_to_pass(int grade_to_pass) {
        this.grade_to_pass = grade_to_pass;
    }

    public Timestamp getSupervisorApprovalDate() {
        return supervisor_approval_date;
    }

    public void setSupervisorApprovalDate(Timestamp supervisor_approval_date) {
        this.supervisor_approval_date = supervisor_approval_date;
    }

    public boolean getSupervisorApproval() {
        return supervisor_approval;
    }

    public void setSupervisorApproval(boolean supervisor_approval) {
        this.supervisor_approval = supervisor_approval;
    }

    public Timestamp getDepartmentApprovalDate() {
        return department_approval_date;
    }

    public void setDepartmentApprovalDate(Timestamp department_approval_date) {
        this.department_approval_date = department_approval_date;
    }

    public void setDepartmentApproval(boolean department_approval) {
        this.department_approval = department_approval;
    }

    public boolean getDepartmentApproval() {
        return department_approval;
    }

    public Timestamp getBencoApprovalDate() {
        return department_approval_date;
    }

    public void setBencoApprovalDate(Timestamp benco_approval_date) {
        this.benco_approval_date = benco_approval_date;
    }

    public boolean getBencoApproval() {
        return benco_approval;
    }

    public void setBencoApproval(boolean benco_approval) {
        this.benco_approval = benco_approval;
    }

    public String getBencoDenyReason() {
        return benco_deny_reason;
    }

    public void setBencoDenyReason(String benco_deny_reason) {
        this.benco_deny_reason = benco_deny_reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claims claims = (Claims) o;
        return claim_id == claims.claim_id &&
                event_id == claims.event_id &&
                grade == claims.grade &&
                grade_to_pass == claims.grade_to_pass &&
                supervisor_approval == claims.supervisor_approval &&
                department_approval == claims.department_approval &&
                benco_approval == claims.benco_approval &&
                Objects.equals(reimbursement_type, claims.reimbursement_type) &&
                Objects.equals(supervisor_approval_date, claims.supervisor_approval_date) &&
                Objects.equals(department_approval_date, claims.department_approval_date) &&
                Objects.equals(benco_approval_date, claims.benco_approval_date) &&
                Objects.equals(benco_deny_reason, claims.benco_deny_reason);
    }

    @Override
    public int hashCode() {

        return Objects.hash(claim_id, event_id, reimbursement_type, grade, grade_to_pass, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval, benco_approval_date, benco_approval, benco_deny_reason);
    }
}
