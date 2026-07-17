import java.util.ArrayList;
import java.util.function.Predicate;

public class HandsOnAssignment4 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 9000));
        employees.add(new Employee(102, "Priya", 12000));
        employees.add(new Employee(103, "Kiran", 8000));
        employees.add(new Employee(104, "Sneha", 18000));
        employees.add(new Employee(105, "Amit", 9500));

        Predicate<Employee> predicate = e -> e.getSalary() < 10000;

        employees.stream()
                .filter(predicate)
                .forEach(e -> System.out.println(e.getName()));
    }
}