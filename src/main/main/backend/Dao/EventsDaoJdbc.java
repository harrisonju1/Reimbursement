package backend.Dao;

import backend.Beans.Events;

import java.sql.*;

public class EventsDaoJdbc implements EventsDao {
    private static ConnectionUtil connectionUtil = ConnectionUtil.getConnectionUtil();

    @Override
    public Events getByEventID(int event_id){
        try(Connection conn = connectionUtil.getConnection()){
            String standardQuery = "SELECT * FROM events WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(standardQuery);
            ps.setInt(1,event_id);

            ResultSet results = ps.executeQuery();
//            ArrayList<Events> events = new ArrayList<>();
            while (results.next()){
                event_id = results.getInt("event_id");
                String reimbursement_type = results.getString("reimbursement_type");
                double cost = results.getDouble("cost");
                int grade = results.getInt("grade");
                int grade_to_pass = results.getInt("grade_to_pass");
                Timestamp event_start = results.getTimestamp("event_start");
                Timestamp event_end = results.getTimestamp("event_end");
                int status = results.getInt("status");
                byte[] attachments = results.getBytes("attachments");
                String name = results.getString("name");
//                events.add(new Events(event_id, reimbursement_type,cost, grade, grade_to_pass,
//                        event_start,event_end,status, attachments, name));
                return new Events(event_id,reimbursement_type,cost,grade,grade_to_pass,event_start,event_end,status,attachments,name);

            }

        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createEvent(Events event){
        try(Connection conn = connectionUtil.getConnection()){
            String query = "INSERT INTO events (event_id, reimbursement_type, cost," +
                    "grade, grade_to_pass, event_start, event_end, status, attachments, name) VALUES " +
                    "(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, event.getEventID());
            ps.setString(2, event.getReimbursementType());
            ps.setDouble(3, event.getCost());
            ps.setInt(4, event.getGrade());
            ps.setInt(5,event.getGradeToPass());
            ps.setTimestamp(6, event.getEventStart());
            ps.setTimestamp(7, event.getEventEnd());
            ps.setInt(8, event.getStatus());
            ps.setBytes(9, event.getAttachments());
            ps.setString(10,event.getName());

            ResultSet results =ps.executeQuery();
            if (results.next()){
                event.setEventID(results.getInt("event_id"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEvent(Events event) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "UPDATE events SET reimbursement_type = ?, cost = ?, grade = ?, grade_to_pass = ?, event_start" +
                    "=?, event_end = ?, status = ?, attachments = ?, name = ? WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, event.getReimbursementType());
            ps.setDouble(2, event.getCost());
            ps.setInt(3, event.getGrade());
            ps.setInt(4,event.getGradeToPass());
            ps.setTimestamp(5, event.getEventStart());
            ps.setTimestamp(6, event.getEventEnd());
            ps.setInt(7, event.getStatus());
            ps.setBytes(8, event.getAttachments());
            ps.setString(9,event.getName());
            ps.setInt(10,event.getEventID());

            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEvent(Events event) {
        try(Connection conn = connectionUtil.getConnection()){
            String query = "DELETE FROM events WHERE event_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,event.getEventID());

            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
