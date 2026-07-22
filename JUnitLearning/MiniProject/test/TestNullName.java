package MiniProject.com.mile1.test;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.exception.NullMarksArrayException;
import MiniProject.com.mile1.exception.NullNameException;
import MiniProject.com.mile1.exception.NullStudentObjectException;
import MiniProject.com.mile1.service.StudentReport;

public class TestNullName {

    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {

        StudentReport report = new StudentReport();

        Student s = new Student(null,
                new int[] {50,50,50,50,50});

        report.validate(s);
    }
}