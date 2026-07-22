package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.exception.NullStudentObjectException;
import MiniProject.com.mile1.service.StudentReport;

public class TestNullStudentObject {

    @Test
    public void testNullStudentObject() {

        StudentReport report = new StudentReport();

        try {
            report.validate(null);
        } catch (NullStudentObjectException e) {
            assertEquals("object is null", e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}