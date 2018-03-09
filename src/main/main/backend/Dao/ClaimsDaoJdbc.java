package backend.Dao;
import backend.Beans.Claims;

import java.sql.*;

public class ClaimsDaoJdbc implements ClaimsDao{

    private static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();


    @Override
    public Claims getByClaimID(int claim_id){
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM claims WHERE claim_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,claim_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Claims> claims = new ArrayList<>();
            while (results.next()){
                claim_id = results.getInt("claim_id");
                int event_id = results.getInt("event_id");
                String reimbursement_type = results.getString("reimbursement_type");
                int grade = results.getInt("grade");
                int grade_to_pass = results.getInt("grade_to_pass");
                Timestamp supervisor_approval_date = results.getTimestamp("supervisor_approval_date");
                boolean supervisor_approval = results.getBoolean("supervisor_approval");
                Timestamp department_approval_date = results.getTimestamp("department_approval_date");
                boolean department_approval = results.getBoolean("department_approval");
                Timestamp benco_approval_date = results.getTimestamp("benco_approval_date");
                boolean benco_approval = results.getBoolean("benco_approval");
                String benco_deny_reason = results.getString("benco_deny_reason");

                //add the row from database to arraylist in an initialized Claims object
//                claims.add(new Claims(claim_id, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval,
//                        benco_approval_date,benco_approval,benco_deny_reason));
                return new Claims(claim_id,event_id, reimbursement_type, grade, grade_to_pass, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval,
                        benco_approval_date,benco_approval,benco_deny_reason);
            }
//            return claims;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Claims getByEventID(int event_id){
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM claims WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,event_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Claims> claims = new ArrayList<>();
            while (results.next()){
                int claim_id = results.getInt("claim_id");
                event_id = results.getInt("event_id");
                String reimbursement_type = results.getString("reimbursement_type");
                int grade = results.getInt("grade");
                int grade_to_pass = results.getInt("grade_to_pass");
                Timestamp supervisor_approval_date = results.getTimestamp("supervisor_approval_date");
                boolean supervisor_approval = results.getBoolean("supervisor_approval");
                Timestamp department_approval_date = results.getTimestamp("department_approval_date");
                boolean department_approval = results.getBoolean("department_approval");
                Timestamp benco_approval_date = results.getTimestamp("benco_approval_date");
                boolean benco_approval = results.getBoolean("benco_approval");
                String benco_deny_reason = results.getString("benco_deny_reason");

                //add the row from database to arraylist in an initialized Claims object
//                claims.add(new Claims(claim_id, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval,
//                        benco_approval_date,benco_approval,benco_deny_reason));
                return new Claims(claim_id,event_id, reimbursement_type, grade, grade_to_pass, supervisor_approval_date, supervisor_approval, department_approval_date, department_approval,
                        benco_approval_date,benco_approval,benco_deny_reason);
            }
//            return claims;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createClaim(Claims claim){
        try(Connection conn = connectionUtil.getConnection()){
            String query = "INSERT INTO claims (event_id,reimbursement_type, grade, grade_to_pass, supervisor_approval_date, supervisor_approval," +
                    "department_approval_date, department_approval, benco_approval_date, benco_approval, benco_deny_reason) VALUES " +
                    "(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,claim.getEvent_id());
            ps.setString(2,claim.getReimbursement_type());
            ps.setInt(3,claim.getGrade());
            ps.setInt(4,claim.getGrade_to_pass());
            ps.setTimestamp(5, claim.getSupervisorApprovalDate());
            ps.setBoolean(6, claim.getSupervisorApproval());
            ps.setTimestamp(7, claim.getDepartmentApprovalDate());
            ps.setBoolean(8,claim.getDepartmentApproval());
            ps.setTimestamp(9, claim.getBencoApprovalDate());
            ps.setBoolean(10, claim.getBencoApproval());
            ps.setString(11, claim.getBencoDenyReason());

            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateClaim(Claims claim){
        try(Connection conn = connectionUtil.getConnection()){
            String query = "UPDATE claims SET supervisor_approval_date = ?, supervisor_approval = ?, " +
                    "department_approval_date = ?, department_approval = ?, benco_approval_date =?," +
                    "benco_approval = ?, benco_deny_reason = ?  WHERE claim_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setTimestamp(1, claim.getSupervisorApprovalDate());
            ps.setBoolean(2 ,claim.getSupervisorApproval());
            ps.setTimestamp(3, claim.getDepartmentApprovalDate());
            ps.setBoolean(4,claim.getDepartmentApproval());
            ps.setTimestamp(5,claim.getBencoApprovalDate());
            ps.setBoolean(6, claim.getBencoApproval());
            ps.setString(7,claim.getBencoDenyReason());
            ps.setInt(8,claim.getClaim_id());
            ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteClaim(Claims claim){
        try(Connection conn = connectionUtil.getConnection()){
            String query = "DELETE FROM claims WHERE claim_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,claim.getClaim_id());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
