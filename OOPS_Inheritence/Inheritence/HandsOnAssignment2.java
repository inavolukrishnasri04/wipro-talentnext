public class HandsOnAssignment2 {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Srividya",
                550000,
                2026,
                "NIN12345");

        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("Name              : " + emp.getName());
        System.out.println("Annual Salary     : " + emp.getAnnualSalary());
        System.out.println("Year Started      : " + emp.getYearStarted());
        System.out.println("Insurance Number  : " + emp.getNationalInsuranceNumber());
    }
}