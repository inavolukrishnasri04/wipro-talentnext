import java.util.ArrayList;
import java.util.function.Predicate;

public class HandsOnAssignment5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 9; i++)
            numbers.add(i * i);

        Predicate<Integer> perfectSquare =
                n -> Math.sqrt(n) == (int) Math.sqrt(n);

        numbers.stream()
                .filter(perfectSquare)
                .forEach(System.out::println);
    }
}