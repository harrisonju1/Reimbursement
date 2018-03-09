package backend.Containers.Servlet.Controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.*;
import backend.Services.JsonSerializer;
import backend.Beans.*;
import backend.Services.*;
import com.google.gson.Gson;


public class SubmitClaimController extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = "";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();;
        }

        BufferedReader reader = req.getReader();
        Events event = (Events) new JsonSerializer().deserialize(reader, Events.class);
        for(Cookie cookie : req.getCookies()){
            if (cookie.getName().equals("username")){
                username = cookie.getValue();
                break;
            }
        }
        event.setUsername(username);
        event.setStatus(0);
        EventsService e = new EventsService();;
        e.createEvent(event);
        Claims claim = new Claims();
        event = e.getByUsername(username);
        //create claims table in jdbc
        claim = claimUtil(event);

        //respond with rendering of claim status
        resp.setContentType("application/json");
        resp.setStatus(200);
        Gson gson = new Gson();
        String forms = gson.toJson(claim);
        PrintWriter out = resp.getWriter();
        out.print(forms);
        out.flush();
    }
    public Claims claimUtil(Events event){
        ClaimsService c = new ClaimsService();
        Claims claim = new Claims();
        claim.setClaim_id(0);
        claim.setEvent_id(event.getEventID());
        claim.setReimbursement_type(event.getReimbursementType());
        claim.setGrade(event.getGrade());
        claim.setGrade_to_pass(event.getGradeToPass());
        c.createClaim(claim);
        claim = c.getByEventID(event.getEventID());
        return claim;
    }


//    public void reimbursementUtil(Events event){
//        Reimbursements r = new Reimbursements();
//        r.setEventID(event.getEventID());
//        r.setClaimCreated(event.);
//    }
}
