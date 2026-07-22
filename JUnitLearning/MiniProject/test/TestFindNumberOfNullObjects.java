package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.service.StudentService;

public class TestFindNumberOfNullObjects {

    @Test
    public void testFindNumberOfNullObjects() {

        Student[] s = new Student[4];

        s[0] = new Student("A", new int[] {50});
        s[1] = null;
        s[2] = new Student("B", new int[] {60});
        s[3] = null;

        StudentService service = new StudentService();

        assertEquals(2, service.findNumberOfNullObjects(s));
    }
}