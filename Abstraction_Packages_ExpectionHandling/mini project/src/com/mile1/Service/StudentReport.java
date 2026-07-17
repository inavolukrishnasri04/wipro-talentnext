package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null) {
            throw new NullStudentObjectException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        int[] marks = student.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                return "FAIL";
            }
        }

        return "PASS";
    }
}