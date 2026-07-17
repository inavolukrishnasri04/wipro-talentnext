public class Employee {

    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee [empNo=" + empNo +
                ", name=" + name +
                ", age=" + age +
                ", location=" + location + "]";
    }
}