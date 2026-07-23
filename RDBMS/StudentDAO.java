package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void insertStudent(Student student) {

        String sql = """
                INSERT INTO STUDENT
                (ROLLNO, STUDENTNAME, STANDARD, DATE_OF_BIRTH, FEES)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getRollNo());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getStandard());
            ps.setDate(4, student.getDateOfBirth());
            ps.setDouble(5, student.getFees());

            int rows = ps.executeUpdate();

            if (rows == 1) {
                System.out.println("Student record inserted successfully");
            }

        } catch (SQLException e) {
            System.out.println("Student record could not be inserted");
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int rollNo) {

        String selectSql = """
                SELECT ROLLNO, STUDENTNAME, STANDARD
                FROM STUDENT
                WHERE ROLLNO = ?
                """;

        String logSql = """
                INSERT INTO STUDENTLOG
                (ROLLNO, STUDENTNAME, STANDARD, LEAVING_DATE)
                VALUES (?, ?, ?, SYSDATE)
                """;

        String deleteSql = """
                DELETE FROM STUDENT
                WHERE ROLLNO = ?
                """;

        try (Connection con = DBUtil.getConnection()) {

            con.setAutoCommit(false);

            try (PreparedStatement selectPs =
                         con.prepareStatement(selectSql)) {

                selectPs.setInt(1, rollNo);

                try (ResultSet rs = selectPs.executeQuery()) {

                    if (!rs.next()) {
                        System.out.println("Student record not found");
                        con.rollback();
                        return;
                    }

                    try (PreparedStatement logPs =
                                 con.prepareStatement(logSql);
                         PreparedStatement deletePs =
                                 con.prepareStatement(deleteSql)) {

                        logPs.setInt(1, rs.getInt("ROLLNO"));
                        logPs.setString(
                                2, rs.getString("STUDENTNAME"));
                        logPs.setString(
                                3, rs.getString("STANDARD"));

                        logPs.executeUpdate();

                        deletePs.setInt(1, rollNo);
                        deletePs.executeUpdate();

                        con.commit();

                        System.out.println(
                                "Student record logged and deleted successfully");
                    }
                }

            } catch (SQLException e) {
                con.rollback();
                throw e;
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException e) {
            System.out.println("Student record could not be deleted");
            System.out.println(e.getMessage());
        }
    }

    public void updateFees(int rollNo, double newFees) {

        String sql = """
                UPDATE STUDENT
                SET FEES = ?
                WHERE ROLLNO = ?
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, newFees);
            ps.setInt(2, rollNo);

            int rows = ps.executeUpdate();

            if (rows == 1) {
                System.out.println(
                        "Student fee updated successfully");
            } else {
                System.out.println("Student record not found");
            }

        } catch (SQLException e) {
            System.out.println("Student fee could not be updated");
            System.out.println(e.getMessage());
        }
    }

    public void displayStudent(int rollNo) {

        String sql = """
                SELECT ROLLNO,
                       STUDENTNAME,
                       STANDARD,
                       TO_CHAR(DATE_OF_BIRTH,
                               'DD-MON-YYYY') AS DOB,
                       FEES
                FROM STUDENT
                WHERE ROLLNO = ?
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, rollNo);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    printHeading();
                    printRecord(rs);
                } else {
                    System.out.println("Student record not found");
                }
            }

        } catch (SQLException e) {
            System.out.println("Unable to display student");
            System.out.println(e.getMessage());
        }
    }

    public void displayAllStudents() {

        String sql = """
                SELECT ROLLNO,
                       STUDENTNAME,
                       STANDARD,
                       TO_CHAR(DATE_OF_BIRTH,
                               'DD-MON-YYYY') AS DOB,
                       FEES
                FROM STUDENT
                ORDER BY ROLLNO
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            boolean found = false;
            printHeading();

            while (rs.next()) {
                found = true;
                printRecord(rs);
            }

            if (!found) {
                System.out.println("No student records found");
            }

        } catch (SQLException e) {
            System.out.println("Unable to display students");
            System.out.println(e.getMessage());
        }
    }

    private void printHeading() {
        System.out.printf(
                "%-10s %-22s %-10s %-15s %-10s%n",
                "ROLLNO", "STUDENT NAME", "STANDARD",
                "DATE OF BIRTH", "FEES");

        System.out.println(
                "---------------------------------------------------------------------");
    }

    private void printRecord(ResultSet rs) throws SQLException {
        System.out.printf(
                "%-10d %-22s %-10s %-15s %-10.2f%n",
                rs.getInt("ROLLNO"),
                rs.getString("STUDENTNAME"),
                rs.getString("STANDARD"),
                rs.getString("DOB"),
                rs.getDouble("FEES"));
    }
}