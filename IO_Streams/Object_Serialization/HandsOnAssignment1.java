import java.io.*;
import java.util.Date;

class HandsOnAssignment1 {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Srividya",
                new Date(),
                "IT",
                "Software Engineer",
                50000.0);

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object serialized successfully.");

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("data"));

            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}