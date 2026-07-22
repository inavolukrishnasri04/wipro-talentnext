package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.service.StudentReport;

public class TestGradeD {

    @Test
    public void testGradeD() {

        StudentReport report = new StudentReport();

        Student student = new Student("Rupa",
                new int[] {35,35,35,35,35});

        assertEquals("D", report.findGrades(student));
    }
}