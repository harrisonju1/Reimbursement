package backend.Beans;

import java.sql.*;
import java.util.Arrays;
import java.util.Objects;


public class Events {
    private int event_id;
    private String reimbursement_type;
    private double cost;
    private int grade;
    private int grade_to_pass;
    private Timestamp event_start;
    private Timestamp event_end;
    private int status;
    private byte[] attachments;
    private String username;

    public Events(){
        this.reimbursement_type = null;
        this.cost = 0;
        this.grade = 0;
        this.grade_to_pass = 0;
        this.event_start = null;
        this.event_end = null;
        this.status = 0;
        this.attachments = null;
        this.username = null;
    }

    public Events(String reimbursement_type, double cost, int grade, int grade_to_pass, Timestamp event_start, Timestamp event_end,
           int status, byte[] attachments, String username){
        this.reimbursement_type = reimbursement_type;
        this.cost = cost;
        this.grade = grade;
        this.grade_to_pass = grade_to_pass;
        this.event_start = event_start;
        this.event_end = event_end;
        this.status = status;
        this.attachments = attachments;
        this.username = username;
    }

    public int getEventID() {
        return event_id;
    }
    public void setEventID(int eventID){this.event_id=eventID;}

    public String getReimbursementType() {
        return reimbursement_type;
    }

    public void setReimbursementType(String reimbursement_type) {
        this.reimbursement_type = reimbursement_type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGradeToPass() {
        return grade_to_pass;
    }

    public void setGradeToPass(int grade_to_pass) {
        this.grade_to_pass = grade_to_pass;
    }

    public Timestamp getEventStart() {
        return event_start;
    }

    public void setEventStart(Timestamp event_start) {
        this.event_start = event_start;
    }

    public Timestamp getEventEnd() {
        return event_end;
    }

    public void setEventEnds(Timestamp event_ends) {
        this.event_end = event_ends;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return event_id == events.event_id &&
                Double.compare(events.cost, cost) == 0 &&
                grade == events.grade &&
                grade_to_pass == events.grade_to_pass &&
                status == events.status &&
                Objects.equals(reimbursement_type, events.reimbursement_type) &&
                Objects.equals(event_start, events.event_start) &&
                Objects.equals(event_end, events.event_end) &&
                Arrays.equals(attachments, events.attachments) &&
                Objects.equals(username, events.username);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(event_id, reimbursement_type, cost, grade, grade_to_pass, event_start, event_end, status, username);
        result = 31 * result + Arrays.hashCode(attachments);
        return result;
    }
}
