package backend.Dao;

import backend.Beans.Reimbursements;
import java.util.*;
import java.sql.*;

public class ReimbursementsDaoJdbc implements ReimbursementsDao{
    private static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();

    @Override
    public Reimbursements getByEventID(int event_id) {
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM reimbursements WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,event_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Reimbursements> reimbursements = new ArrayList<>();
            while (results.next()){
                event_id = results.getInt("event_id");
                String reimbursement_type = results.getString("reimbursement_type");
                int claim_id = results.getInt("claim_id");
                Timestamp claim_created = results.getTimestamp("claim_created");
                Timestamp claim_resolved = results.getTimestamp("claim_resolved");
                int employee_id = results.getInt("employee_id");
//                reimbursements.add(new Reimbursements(event_id, reimbursement_type,claim_id, claim_created, claim_resolved));
                Reimbursements reimbursement = new Reimbursements(event_id,reimbursement_type,claim_id,claim_created,claim_resolved, employee_id);
                return reimbursement;
            }
//            return reimbursements;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Reimbursements getByClaimID(int claim_id) {
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM reimbursements WHERE claim_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,claim_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Reimbursements> reimbursements = new ArrayList<>();
            while (results.next()){
                claim_id = results.getInt("claim_id");
                String reimbursement_type = results.getString("reimbursement_type");
                int event_id = results.getInt("event_id");
                Timestamp claim_created = results.getTimestamp("claim_created");
                Timestamp claim_resolved = results.getTimestamp("claim_resolved");
//                reimbursements.add(new Reimbursements(event_id, reimbursement_type,claim_id, claim_created, claim_resolved));
                int employee_id = results.getInt("employee_id");
                return new Reimbursements(claim_id,reimbursement_type,event_id,claim_created,claim_resolved,employee_id);
            }
//            return reimbursements;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Reimbursements> getByEmployeeID(int employee_id) {
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM reimbursements WHERE employee_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,employee_id);

            ResultSet results = ps.executeQuery();
            ArrayList<Reimbursements> reimbursements = new ArrayList<>();
            while (results.next()){
                int claim_id = results.getInt("claim_id");
                String reimbursement_type = results.getString("reimbursement_type");
                int event_id = results.getInt("event_id");
                Timestamp claim_created = results.getTimestamp("claim_created");
                Timestamp claim_resolved = results.getTimestamp("claim_resolved");
                employee_id = results.getInt("employee_id");
                reimbursements.add(new Reimbursements(event_id, reimbursement_type,claim_id, claim_created, claim_resolved, employee_id));

            }
            return reimbursements;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createReimbursement(Reimbursements reimbursement) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "INSERT INTO reimbursements (claim_id, reimbursement_type, event_id," +
                    "claim_created, claim_resolved, employee_id) VALUES " +
                    "(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, reimbursement.getClaimID());
            ps.setString(2, reimbursement.getReimbursementType());
            ps.setInt(3, reimbursement.getEventID());
            ps.setTimestamp(4, reimbursement.getClaimCreated());
            ps.setTimestamp(5,reimbursement.getClaimResolved());
            ps.setInt(6, reimbursement.getEmployeeID());


            ResultSet results =ps.executeQuery();
            if (results.next()){
                reimbursement.setEventID(results.getInt("claim_id"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateReimbursement(Reimbursements reimbursement) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "UPDATE reimbursements SET reimbursement_type = ?, event_id = ?, " +
                    "claim_created = ?, claim_resolved =?, employee_id = ?WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, reimbursement.getEventID());
            ps.setString(2, reimbursement.getReimbursementType());
            ps.setTimestamp(4, reimbursement.getClaimCreated());
            ps.setTimestamp(5,reimbursement.getClaimResolved());
            ps.setInt(6, reimbursement.getEmployeeID());


            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteReimbursement(Reimbursements reimbursement) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "DELETE FROM reimbursements WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,reimbursement.getEventID());
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
