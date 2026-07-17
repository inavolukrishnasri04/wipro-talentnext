import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            list.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(list);

        System.out.println("\nEmployee List:\n");

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        for (Employee e : list) {
            System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}