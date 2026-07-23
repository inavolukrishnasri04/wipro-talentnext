package com.wipro.jdbc;

import java.sql.Date;

public class Student {

    private int rollNo;
    private String studentName;
    private String standard;
    private Date dateOfBirth;
    private double fees;

    public Student(int rollNo, String studentName, String standard,
                   Date dateOfBirth, double fees) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.standard = standard;
        this.dateOfBirth = dateOfBirth;
        this.fees = fees;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStandard() {
        return standard;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getFees() {
        return fees;
    }
}