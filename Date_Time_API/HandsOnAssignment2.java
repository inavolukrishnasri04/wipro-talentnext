import java.time.DayOfWeek;
import java.time.LocalDate;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;

        while (true) {

            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
            }

            if (sundayCount == 2) {
                break;
            }

            date = date.plusDays(1);
        }

        System.out.println("Second Sunday of Next Month : " + date);
    }
}