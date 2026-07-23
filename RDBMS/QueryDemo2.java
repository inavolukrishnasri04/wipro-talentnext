package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryDemo2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/ORCLPDB",
                    "HR",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT FIRST_NAME, JOB_ID, SALARY, COMMISSION_PCT "
                  + "FROM EMPLOYEES "
                  + "WHERE SALARY > 1000 AND SALARY < 2000");

            while (rs.next()) {

                System.out.println(
                        rs.getString("FIRST_NAME") + "\t"
                      + rs.getString("JOB_ID") + "\t"
                      + rs.getDouble("SALARY") + "\t"
                      + rs.getString("COMMISSION_PCT"));

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}