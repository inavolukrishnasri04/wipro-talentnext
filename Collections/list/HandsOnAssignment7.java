import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + empId +
               "\nName        : " + empName +
               "\nEmail       : " + email +
               "\nGender      : " + gender +
               "\nSalary      : " + salary;
    }
}

public class HandsOnAssignment7 {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000));
        employees.add(new Employee(102, "Anitha", "anitha@gmail.com", "Female", 50000));
        employees.add(new Employee(103, "Kiran", "kiran@gmail.com", "Male", 55000));

        System.out.println("Using Iterator:\n");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println();
        }

        System.out.println("Using Enumeration:\n");

        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
            System.out.println();
        }
    }
}