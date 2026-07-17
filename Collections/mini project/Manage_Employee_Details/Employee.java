public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber,
                    String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }
}