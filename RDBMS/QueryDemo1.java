package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryDemo1 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/ORCLPDB",
                    "HR",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "   " +
                        rs.getString("FIRST_NAME"));

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}