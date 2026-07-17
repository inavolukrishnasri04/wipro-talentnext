import java.util.ArrayList;
import java.util.function.Function;

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", "Pune", 25000));
        employees.add(new Employee(102, "Priya", "Hyderabad", 30000));
        employees.add(new Employee(103, "Kiran", "Chennai", 28000));
        employees.add(new Employee(104, "Sneha", "Bangalore", 35000));
        employees.add(new Employee(105, "Amit", "Delhi", 27000));

        Function<ArrayList<Employee>, ArrayList<String>> function = list -> {
            ArrayList<String> locations = new ArrayList<>();
            for (Employee e : list) {
                locations.add(e.location);
            }
            return locations;
        };

        ArrayList<String> result = function.apply(employees);

        result.forEach(System.out::println);
    }
}