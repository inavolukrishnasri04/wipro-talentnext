
import java.util.Optional;

class Employee {

	String name;

	Employee(String name) {
		this.name = name;
	}
}

class InvalidEmployeeException extends Exception {

	InvalidEmployeeException(String msg) {
		super(msg);
	}
}

public class HandsOnAssignment3 {

	public static void main(String[] args) {

		Employee emp = null;

		try {

			Optional.ofNullable(emp)
					.orElseThrow(() -> new InvalidEmployeeException("Employee is Null"));

			System.out.println("Employee Found");

		} catch (InvalidEmployeeException e) {

			System.out.println(e.getMessage());
		}
	}
}