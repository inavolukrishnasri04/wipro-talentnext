import java.time.LocalDate;

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today's Date : " + today);
        System.out.println("Date after 10 days : " + afterTenDays);
    }
}