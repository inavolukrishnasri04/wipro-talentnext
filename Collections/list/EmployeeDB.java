import java.util.ArrayList;

class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip for Employee ID " + empId +
                        "\nName : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }

        return "Employee not found";
    }
}