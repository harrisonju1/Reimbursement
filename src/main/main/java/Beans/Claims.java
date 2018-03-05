package Beans;

import java.util.*;
import java.sql.*;

public class Claims {
    private int claim_id;
    private Timestamp supervisor_approval_date;
    private boolean supervisor_approval;
    private Timestamp department_approval_date;
    private boolean department_approval;
    private Timestamp benco_approval_date;
    private boolean benco_approval;
    private String benco_deny_reason;

    public Claims(int claim_id, Timestamp supervisor_approval_date, boolean supervisor_approval, Timestamp department_approval_date,
                  boolean department_approval, Timestamp benco_approval_date, boolean benco_approval, String benco_deny_reason) {
        this.claim_id = claim_id;
        this.supervisor_approval_date = supervisor_approval_date;
        this.supervisor_approval = supervisor_approval;
        this.department_approval_date = department_approval_date;
        this.department_approval = department_approval;
        this.benco_approval_date = benco_approval_date;
        this.benco_approval = benco_approval;
        this.benco_deny_reason = benco_deny_reason;
    }

    public Claims() {
        this.claim_id = 0;
        this.supervisor_approval_date = null;
        this.supervisor_approval = false;
        this.department_approval_date = null;
        this.department_approval = false;
        this.benco_approval_date = null;
        this.benco_approval = false;
        this.benco_deny_reason = null;
    }

    public int getClaimID() {
        return claim_id;
    }

    public void setClaimID(int claim_id) {
        this.claim_id = claim_id;
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
                supervisor_approval == claims.supervisor_approval &&
                department_approval == claims.department_approval &&
                benco_approval == claims.benco_approval &&
                Objects.equals(supervisor_approval_date, claims.supervisor_approval_date) &&
                Objects.equals(department_approval_date, claims.department_approval_date) &&
                Objects.equals(benco_approval_date, claims.benco_approval_date) &&
                Objects.equals(benco_deny_reason, claims.benco_deny_reason);
    }

    @Override
    public int hashCode() {

        return Objects.hash(claim_id, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval, benco_approval_date, benco_approval, benco_deny_reason);
    }
}
