package com.wipro.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class CallableDemo {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/ORCLPDB",
                    "HR",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES");

            System.out.println("EMP_ID\tNAME\tNET SALARY");

            while(rs.next()) {

                CallableStatement cs =
                        con.prepareCall("{call CALCULATE_NET_SALARY(?,?)}");

                cs.setInt(1, rs.getInt("EMPLOYEE_ID"));

                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                System.out.println(
                        rs.getInt("EMPLOYEE_ID") + "\t"
                      + rs.getString("FIRST_NAME") + "\t"
                      + cs.getDouble(2));

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}