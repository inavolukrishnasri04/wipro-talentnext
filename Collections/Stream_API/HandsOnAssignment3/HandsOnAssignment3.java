import java.util.ArrayList;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "siva", 65));
        list.add(new Student(2, "vidya", 45));
        list.add(new Student(3, "suri", 75));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed: " + count);
    }
}