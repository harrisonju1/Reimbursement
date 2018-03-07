package java.Containers.Servlet.Controllers;

import java.Services.AuthorizeService;
import java.Beans.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AuthorizationController {
    public void authorize(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Employee e = new Employee();

        if(AuthorizeService.authorize(e)){
            response.setStatus(200);
            response.setHeader("Authorization", AuthorizeService.getToken(e));
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }


}
