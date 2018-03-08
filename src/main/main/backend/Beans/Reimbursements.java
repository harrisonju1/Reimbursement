package backend.Beans;

import java.sql.*;
import java.util.Objects;

public class Reimbursements {
    private int event_id;
    private String reimbursement_type;
    private int claim_id;
    private Timestamp claim_created;
    private Timestamp claim_resolved;
    private int employee_id;

    public Reimbursements(int event_id, String reimbursement_type, int claim_id, Timestamp claim_created, Timestamp claim_resolved, int employee_id) {
        this.event_id = event_id;
        this.reimbursement_type = reimbursement_type;
        this.claim_id = claim_id;
        this.claim_created = claim_created;
        this.claim_resolved = claim_resolved;
        this.employee_id = employee_id;
    }

    public Reimbursements(){
        this.event_id = -1;
        this.reimbursement_type = null;
        this.claim_id = -1;
        this.claim_created = null;
        this.claim_resolved = null;
        this.employee_id = -1;
    }

    public int getEventID() {
        return event_id;
    }

    public void setEventID(int event_id) {
        this.event_id = event_id;
    }

    public String getReimbursementType() {
        return reimbursement_type;
    }

    public void setReimbursementType(String reimbursement_type) {
        this.reimbursement_type = reimbursement_type;
    }

    public int getClaimID() {
        return claim_id;
    }

    public void setClaimID(int claim_id) {
        this.claim_id = claim_id;
    }

    public int getEmployeeID(){return employee_id;}

    public void setEmployeeID(int employee_id){this.employee_id=employee_id;}

    public Timestamp getClaimCreated() {
        return claim_created;
    }

    public void setClaimCreated(Timestamp claim_created) {
        this.claim_created = claim_created;
    }

    public Timestamp getClaimResolved() {
        return claim_resolved;
    }

    public void setClaimResolved(Timestamp claim_resolved) {
        this.claim_resolved = claim_resolved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reimbursements that = (Reimbursements) o;
        return event_id == that.event_id &&
                claim_id == that.claim_id &&
                employee_id == that.employee_id &&
                Objects.equals(reimbursement_type, that.reimbursement_type) &&
                Objects.equals(claim_created, that.claim_created) &&
                Objects.equals(claim_resolved, that.claim_resolved);
    }

    @Override
    public int hashCode() {

        return Objects.hash(event_id, reimbursement_type, claim_id, claim_created, claim_resolved, employee_id);
    }
}

