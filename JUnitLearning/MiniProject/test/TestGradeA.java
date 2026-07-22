package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.service.StudentReport;

public class TestGradeA {

    @Test
    public void testGradeA() {

        StudentReport report = new StudentReport();

        Student student = new Student("Rupa",
                new int[] {49,49,49,49,49});

        assertEquals("A", report.findGrades(student));
    }
}