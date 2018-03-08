package backend.Services;

import backend.Beans.Reimbursements;
import backend.Dao.ReimbursementsDao;
import backend.Dao.ReimbursementsDaoJdbc;

public class ReimbursementsService {
    private static ReimbursementsDao reimbursementsDao= new ReimbursementsDaoJdbc();

    public Reimbursements getEventByID(int event_id){
        return reimbursementsDao.getByEventID(event_id);
    }
    public Reimbursements getClaimByID(int claim_id){
        return reimbursementsDao.getByClaimID(claim_id);
    }

    void createReimbursement(Reimbursements reimbursement){
        reimbursementsDao.createReimbursement(reimbursement);
    }
    void updateReimbursement(Reimbursements reimbursement){
        reimbursementsDao.updateReimbursement(reimbursement);
    }
    void deleteReimbursement(Reimbursements reimbursement){
        reimbursementsDao.deleteReimbursement(reimbursement);
    }
}
