package java.Services;

import java.Beans.Employee;
import java.util.*;


public class AuthorizeService {
    public static boolean authorize(Employee e){
        return true;
    }

    public static String getToken(Employee e){
        long ms = new Date().getTime();
        String s= "aABbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
        Random r = new Random(ms);
        String token = new String();
        for(int i = 0; i < 16; i++){
            token += s.charAt(0 + r.nextInt(s.length() - 1));
        }

        return token;
    }

}
