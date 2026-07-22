package MiniProject.com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MiniProject.com.mile1.bean.Student;
import MiniProject.com.mile1.service.StudentService;

public class TestFindNumberOfNullNames {

    @Test
    public void testFindNumberOfNullNames() {

        Student[] s = new Student[3];

        s[0] = new Student("A", new int[] {50});
        s[1] = new Student(null, new int[] {50});
        s[2] = new Student(null, new int[] {60});

        StudentService service = new StudentService();

        assertEquals(2, service.findNumberOfNullName(s));
    }
}