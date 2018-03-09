package backend.Services;

import backend.Dao.ClaimsDao;
import backend.Dao.ClaimsDaoJdbc;
import backend.Beans.Claims;

public class ClaimsService {
    private static ClaimsDao claimsDao = new ClaimsDaoJdbc();

    public Claims getClaim(int id){
        return claimsDao.getByClaimID(id);
    }

    public Claims getByEventID(int event_id) {return claimsDao.getByEventID(event_id);}

    public void createClaim(Claims claim){
        claimsDao.createClaim(claim);
    }

    public void updateClaim(Claims claim){
        claimsDao.updateClaim(claim);
    }

    public void deleteClaim(Claims claim){
        claimsDao.deleteClaim(claim);
    }
}
