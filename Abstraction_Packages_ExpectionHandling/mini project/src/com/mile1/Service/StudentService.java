package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }

        return count;
    }
}