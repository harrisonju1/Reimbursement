package backend.Containers.Servlet.Controllers;

import backend.Beans.*;
import backend.Services.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import com.fasterxml.jackson.core.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.*;
import org.json.simple.JSONObject;
import com.google.gson.Gson;
import backend.Services.JsonSerializer;
import sun.tools.java.ClassNotFound;

public class ClaimStatusController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("application/json");

    }
}
