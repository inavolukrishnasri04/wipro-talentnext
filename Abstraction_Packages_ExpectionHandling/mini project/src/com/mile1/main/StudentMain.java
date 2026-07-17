package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student data[] = new Student[4];

        data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        data[1] = new Student(null, new int[] { 11, 22, 33 });
        data[2] = new Student("Manoj", null);
        data[3] = null;

        StudentReport report = new StudentReport();

        System.out.println("Grades Calculation");

        for (int i = 0; i < data.length; i++) {

            try {
                String result = report.validate(data[i]);
                System.out.println("Student " + (i + 1) + " : " + result);

            } catch (NullStudentObjectException e) {
                System.out.println(e);

            } catch (NullNameException e) {
                System.out.println(e);

            } catch (NullMarksArrayException e) {
                System.out.println(e);
            }
        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Number of Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullNames(data));

        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}