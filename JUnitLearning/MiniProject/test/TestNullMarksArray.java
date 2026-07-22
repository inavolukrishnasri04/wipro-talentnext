package MiniProject.com.mile1.test;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.exception.NullMarksArrayException;
import MiniProject.com.mile1.exception.NullNameException;
import MiniProject.com.mile1.exception.NullStudentObjectException;
import MiniProject.com.mile1.service.StudentReport;

public class TestNullMarksArray {

    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArray() throws Exception {

        StudentReport report = new StudentReport();

        Student s = new Student("Rupa", null);

        report.validate(s);
    }
}