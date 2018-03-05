package Dao;

import Beans.Reimbursements;
import java.util.*;

public interface ReimbursementsDao {
    Reimbursements getByEventID(int event_id);
    Reimbursements getByClaimID(int claim_id);
    ArrayList<Reimbursements> getByEmployeeID(int employee_id);
    void createReimbursement(Reimbursements reimbursement);
    void updateReimbursement(Reimbursements reimbursement);
    void deleteReimbursement(Reimbursements reimbursement);
}
