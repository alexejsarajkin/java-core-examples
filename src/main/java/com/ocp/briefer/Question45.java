package com.ocp.briefer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question45 {
    static Connection newConnection = null;

    public static Connection getDBConnection() throws SQLException {
        String URL = "1";
        String userName= "1";
        String passWord= "1";

        try (Connection con = DriverManager.getConnection(URL, userName, passWord)) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDBConnection();
        Statement st = newConnection.createStatement();
//        st.executeUpdate("INSERT INTO student VALUES(102, 'Kelvin')");
    }
}
