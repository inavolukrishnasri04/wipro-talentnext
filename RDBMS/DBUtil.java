package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL =
            "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";

    private static final String USERNAME = "HR";
    private static final String PASSWORD = "hr";

    private DBUtil() {
        // Prevent object creation
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}