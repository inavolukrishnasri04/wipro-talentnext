import java.time.LocalDate;

public class HandsOnAssignment4 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        if (today.isLeapYear()) {
            System.out.println(today.getYear() + " is a Leap Year");
        } else {
            System.out.println(today.getYear() + " is not a Leap Year");
        }
    }
}