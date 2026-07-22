package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.service.StudentReport;

public class TestGradeF {

    @Test
    public void testGradeF() {

        StudentReport report = new StudentReport();

        Student student = new Student("Rupa",
                new int[] {10,40,50,60,70});

        assertEquals("F", report.findGrades(student));
    }
}