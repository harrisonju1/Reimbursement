package backend.Dao;

import sun.tools.java.ClassNotFound;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    public static ConnectionUtil connectionUtil = new ConnectionUtil();

    public ConnectionUtil() {
        super();
    }

    public static ConnectionUtil getConnectionUtil() {
        return connectionUtil;
    }

    public Connection getConnection() {
        try {
            Properties prop = new Properties();
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e){
                e.printStackTrace();;
            }
            prop.load(new FileReader("/Users/Harrison/Documents/GitHub/Reimbursement/src/main/main/backend/Dao/database (1).properties"));
            return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        } catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

