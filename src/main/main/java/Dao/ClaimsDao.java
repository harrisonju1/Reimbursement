package Dao;

import Beans.Claims;
import java.sql.*;
import java.util.*;

public interface ClaimsDao {
    Claims getByClaimID(int claim_id);
    void createClaim(Claims claim);
    void updateClaim(Claims claim);
    void deleteClaim(Claims claim);
}
