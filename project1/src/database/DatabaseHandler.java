package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler {
    //private static final String CLOUD_MYSQL_URL = "jdbc:mysql:///swavor1?cloudSqlInstance=database1&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false&user=root&password=nwhacks"; //need to find the mySQL thing
    private static final String CLOUD_MYSQL_LOCAL_URL = "jdbc:mysql://localhost:3306/swavor1";
    private static final String EXCEPTION_TAG = "[EXCEPTION]";
    private static final String WARNING_TAG = "[WARNING]";

    private Connection connection = null;

    public DatabaseHandler() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean login(String username, String password) {
        try {
            if (connection != null) {
                connection.close();
            }
            connection = DriverManager.getConnection(CLOUD_MYSQL_LOCAL_URL, username, password);
            connection.setAutoCommit(false);
            System.out.println("Connected to MySQL cloud!");
            return true;
        } catch (SQLException e) {
            System.out.println(EXCEPTION_TAG + " " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    private void rollbackConnection() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            System.out.println(EXCEPTION_TAG + " " + e.getMessage());
        }
    }
}
