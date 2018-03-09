package backend.Containers.Servlet.Controllers;

import backend.Services.AuthorizeService;
import backend.Beans.Events;
import backend.Services.EventsService;
import com.fasterxml.jackson.core.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.*;
import org.json.simple.JSONObject;
import backend.Beans.Employee;
import com.google.gson.Gson;
import backend.Services.JsonSerializer;
import backend.Services.EmployeeService;
import sun.tools.java.ClassNotFound;

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
        System.out.println(username);
        event.setUsername(username);
        event.setStatus(0);

        EventsService e = new EventsService();
        System.out.println(event.getCost());
        System.out.println(event.getUsername());
        e.createEvent(event);
        resp.setStatus(200);
    }
}
