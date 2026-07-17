import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 24, "Pune"));
        list.add(new Employee(102, "Priya", 25, "Hyderabad"));
        list.add(new Employee(103, "Amit", 28, "Pune"));
        list.add(new Employee(104, "Sneha", 26, "Chennai"));
        list.add(new Employee(105, "Kiran", 27, "Pune"));

        List<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        puneEmployees.forEach(System.out::println);
    }
}