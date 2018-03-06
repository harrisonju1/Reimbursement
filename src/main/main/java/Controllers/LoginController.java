package java.Controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginController {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.getWriter().write("cool beans booty so big");
    }
}
