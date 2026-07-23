package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {

        Connection con = null;

        try {

           // Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/ORCLPDB",
                    "HR",
                    "hr");

            System.out.println("Connection Established Successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            e.printStackTrace();
        }
    }
}