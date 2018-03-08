package backend.Containers.Servlet.Controllers;


import com.fasterxml.jackson.core.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import org.json.simple.JSONObject;
import backend.Beans.Employee;
import com.google.gson.Gson;
import backend.Services.JsonSerializer;
import backend.Services.EmployeeService;


public class LoginController extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //just do it
        BufferedReader reader = req.getReader();
        //create employee e with the login credentials
        Employee e = (Employee) new JsonSerializer().deserialize(reader, Employee.class);
        //grab username and password
        String username = e.getUsername();
        String password = e.getPassword();

        //check if username and password match with db
        EmployeeService service = new EmployeeService();
        Employee auth =  service.getEmployeeByUsername(username);
        if(auth.getUsername().equals(username) && auth.getPassword().equals(password)){
            System.out.println("login successful!");
        }


    }
}
