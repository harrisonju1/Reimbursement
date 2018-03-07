package java.Containers.Servlet.Controllers;


import com.fasterxml.jackson.core.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginController extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        String out = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Info Form</title>\n" +
                "    <style>\n" +
                "        body{\n" +
                "            margin: 0 auto;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        form{\n" +
                "            margin: 0 auto;\n" +
                "            width: 50%;\n" +
                "            position: relative;\n" +
                "            top: 150px;\n" +
                "        }\n" +
                "        form>div{\n" +
                "            margin: 0 auto;\n" +
                "            width: 100%;\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "        label{\n" +
                "            width: 200px;\n" +
                "            clear: left;\n" +
                "            text-align: right;\n" +
                "            padding-right: 10px;\n" +
                "        }\n" +
                "        label, input{\n" +
                "            float:left;\n" +
                "        }\n" +
                "        form div>button{\n" +
                "            position: absolute;\n" +
                "            left: 340px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"form\" method=\"POST\">\n" +
                "    <div><label>Username</label><input type=\"text\" name=\"username\"></div>\n" +
                "    <div><label>Password</label><input type=\"password\" name=\"password\"></div>\n" +
                "    <div>\n" +
                "        <button>login</button>\n" +
                "    </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        resp.setStatus(200);
        resp.setContentType("text/html");
        resp.getWriter().write(out);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        String out = "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Info Form</title>\n" +
                "    <style>\n" +
                "        body{\n" +
                "            margin: 0 auto;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        form{\n" +
                "            margin: 0 auto;\n" +
                "            width: 50%;\n" +
                "            position: relative;\n" +
                "            top: 150px;\n" +
                "        }\n" +
                "        form>div{\n" +
                "            margin: 0 auto;\n" +
                "            width: 100%;\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "        label{\n" +
                "            width: 200px;\n" +
                "            clear: left;\n" +
                "            text-align: right;\n" +
                "            padding-right: 10px;\n" +
                "        }\n" +
                "        label, input{\n" +
                "            float:left;\n" +
                "        }\n" +
                "        form div>button{\n" +
                "            position: absolute;\n" +
                "            left: 340px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"form\" method=\"POST\">\n" +
                "    <div><label>Username</label><input type=\"text\" name=\"username\"></div>\n" +
                "    <div><label>Password</label><input type=\"password\" name=\"password\"></div>\n" +
                "    <div>\n" +
                "        <button>login</button>\n" +
                "    </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        resp.setStatus(200);
        resp.setContentType("text/html");
        resp.getWriter().write(out);
    }
}
