class HandsOnAssignment2 {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000);
        Employee e2 = new Employee(102, "Anitha", "anitha@gmail.com", "Female", 50000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.GetEmployeeDetails();
        System.out.println();

        e2.GetEmployeeDetails();
        System.out.println();

        System.out.println(db.showPaySlip(101));
        System.out.println();

        db.deleteEmployee(102);

        System.out.println("Employee 102 deleted.");
    }
}