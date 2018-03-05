package java.Services;

import java.Dao.ClaimsDao;
import java.Beans.Claims;
import java.Dao.ClaimsDaoJdbc;

import java.util.*;

public class ClaimsService {
    private static ClaimsDao claimsDao = new ClaimsDaoJdbc();

    public Claims getClaim(int id){
        return claimsDao.getByClaimID(id);
    }

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
