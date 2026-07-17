import java.util.ArrayList;
import java.util.function.Consumer;

public class HandsOnAssignment7 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            numbers.add(i);

        Consumer<Integer> consumer = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        numbers.forEach(consumer);
    }
}