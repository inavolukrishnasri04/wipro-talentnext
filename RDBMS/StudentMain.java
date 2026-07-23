package com.wipro.jdbc;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Set;

public class StudentMain {

    private static final Set<String> VALID_STANDARDS =
            Set.of("I", "II", "III", "IV", "V",
                   "VI", "VII", "VIII", "IX", "X");

    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern(
                    "dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        if (args.length == 0) {
            showUsage();
            return;
        }

        try {
            int option = Integer.parseInt(args[0]);

            switch (option) {

                case 1:
                    insert(args, dao);
                    break;

                case 2:
                    delete(args, dao);
                    break;

                case 3:
                    update(args, dao);
                    break;

                case 4:
                    display(args, dao);
                    break;

                default:
                    System.out.println("Invalid option");
                    showUsage();
            }

        } catch (NumberFormatException e) {
            System.out.println(
                    "Roll number, option and fees must be numeric.");
        } catch (DateTimeParseException e) {
            System.out.println(
                    "Invalid date. Use DD-MMM-YYYY format.");
        }
    }

    private static void insert(
            String[] args, StudentDAO dao) {

        if (args.length != 6) {
            System.out.println(
                    "Usage: 1 rollNo name standard dob fees");
            return;
        }

        int rollNo = Integer.parseInt(args[1]);
        String name = args[2].toUpperCase();
        String standard = args[3].toUpperCase();
        LocalDate dob = LocalDate.parse(args[4], DATE_FORMAT);
        double fees = Double.parseDouble(args[5]);

        if (!isValidRollNo(rollNo)) {
            System.out.println(
                    "Roll number must be a four-digit number.");
            return;
        }

        if (!isValidName(name)) {
            System.out.println(
                    "Name must contain only uppercase letters "
                    + "and must not exceed 20 characters.");
            return;
        }

        if (!VALID_STANDARDS.contains(standard)) {
            System.out.println(
                    "Standard must be between I and X.");
            return;
        }

        if (fees < 0) {
            System.out.println("Fees cannot be negative.");
            return;
        }

        Student student = new Student(
                rollNo,
                name,
                standard,
                Date.valueOf(dob),
                fees);

        dao.insertStudent(student);
    }

    private static void delete(
            String[] args, StudentDAO dao) {

        if (args.length != 2) {
            System.out.println("Usage: 2 rollNo");
            return;
        }

        int rollNo = Integer.parseInt(args[1]);
        dao.deleteStudent(rollNo);
    }

    private static void update(
            String[] args, StudentDAO dao) {

        if (args.length != 3) {
            System.out.println("Usage: 3 rollNo newFees");
            return;
        }

        int rollNo = Integer.parseInt(args[1]);
        double newFees = Double.parseDouble(args[2]);

        if (newFees < 0) {
            System.out.println("Fees cannot be negative.");
            return;
        }

        dao.updateFees(rollNo, newFees);
    }

    private static void display(
            String[] args, StudentDAO dao) {

        if (args.length == 1) {
            dao.displayAllStudents();
        } else if (args.length == 2) {
            int rollNo = Integer.parseInt(args[1]);
            dao.displayStudent(rollNo);
        } else {
            System.out.println("Usage: 4 or 4 rollNo");
        }
    }

    private static boolean isValidRollNo(int rollNo) {
        return rollNo >= 1000 && rollNo <= 9999;
    }

    private static boolean isValidName(String name) {
        return name.length() <= 20
                && name.matches("[A-Z]+");
    }

    private static void showUsage() {
        System.out.println("Options:");
        System.out.println(
                "1 rollNo name standard dob fees - Insert");
        System.out.println(
                "2 rollNo                        - Delete");
        System.out.println(
                "3 rollNo newFees                - Update fees");
        System.out.println(
                "4 rollNo                        - Display one");
        System.out.println(
                "4                               - Display all");
    }
}