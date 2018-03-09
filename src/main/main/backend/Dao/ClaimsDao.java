package backend.Dao;

import backend.Beans.Claims;

public interface ClaimsDao {
    Claims getByClaimID(int claim_id);
    Claims getByEventID(int event_id);
    void createClaim(Claims claim);
    void updateClaim(Claims claim);
    void deleteClaim(Claims claim);
}
