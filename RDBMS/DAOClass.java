package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DAOClass {

    private static final String URL =
            "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";

    private static final String USERNAME = "HR";
    private static final String PASSWORD = "hr";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Insert a student record
    public void insert(int rollNo, String name, String standard,
                       String dob, double fee) {

        String sql = "INSERT INTO STUDENT "
                   + "(ROLLNO, NAME, STANDARD, DOB, FEE) "
                   + "VALUES (?, ?, ?, TO_DATE(?, 'DD-MON-YYYY'), ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setString(4, dob);
            ps.setDouble(5, fee);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record inserted successfully");
            }

        } catch (SQLException e) {
            System.out.println("Record could not be inserted");
            System.out.println(e.getMessage());
        }
    }

    // Delete a student using roll number
    public void delete(int rollNo) {

        String sql = "DELETE FROM STUDENT WHERE ROLLNO = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record deleted successfully");
            } else {
                System.out.println("Student record not found");
            }

        } catch (SQLException e) {
            System.out.println("Record could not be deleted");
            System.out.println(e.getMessage());
        }
    }

    // Modify the fee of a student
    public void modify(int rollNo, double newFee) {

        String sql = "UPDATE STUDENT SET FEE = ? WHERE ROLLNO = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, newFee);
            ps.setInt(2, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student fee updated successfully");
            } else {
                System.out.println("Student record not found");
            }

        } catch (SQLException e) {
            System.out.println("Record could not be modified");
            System.out.println(e.getMessage());
        }
    }

    // Display one student
    public void display(int rollNo) {

        String sql = "SELECT ROLLNO, NAME, STANDARD, "
                   + "TO_CHAR(DOB, 'DD-MON-YYYY') AS DOB, FEE "
                   + "FROM STUDENT WHERE ROLLNO = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, rollNo);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    printHeading(rs);
                    printStudent(rs);
                } else {
                    System.out.println("Student record not found");
                }
            }

        } catch (SQLException e) {
            System.out.println("Unable to display the record");
            System.out.println(e.getMessage());
        }
    }

    // Display all students
    public void display() {

        String sql = "SELECT ROLLNO, NAME, STANDARD, "
                   + "TO_CHAR(DOB, 'DD-MON-YYYY') AS DOB, FEE "
                   + "FROM STUDENT ORDER BY ROLLNO";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            boolean recordsAvailable = false;

            printHeading(rs);

            while (rs.next()) {
                recordsAvailable = true;
                printStudent(rs);
            }

            if (!recordsAvailable) {
                System.out.println("No student records found");
            }

        } catch (SQLException e) {
            System.out.println("Unable to display records");
            System.out.println(e.getMessage());
        }
    }

    // Uses ResultSetMetaData
    private void printHeading(ResultSet rs) throws SQLException {

        ResultSetMetaData metadata = rs.getMetaData();

        for (int i = 1; i <= metadata.getColumnCount(); i++) {
            System.out.printf("%-18s", metadata.getColumnLabel(i));
        }

        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------");
    }

    private void printStudent(ResultSet rs) throws SQLException {

        System.out.printf("%-18d", rs.getInt("ROLLNO"));
        System.out.printf("%-18s", rs.getString("NAME"));
        System.out.printf("%-18s", rs.getString("STANDARD"));
        System.out.printf("%-18s", rs.getString("DOB"));
        System.out.printf("%-18.2f%n", rs.getDouble("FEE"));
    }
}