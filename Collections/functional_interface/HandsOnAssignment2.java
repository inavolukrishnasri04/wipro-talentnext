import java.util.ArrayList;
import java.util.function.Function;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            numbers.add(i);

        Function<ArrayList<Integer>, Integer> sum = list -> {
            int total = 0;
            for (int n : list)
                total += n;
            return total;
        };

        System.out.println("Sum = " + sum.apply(numbers));
    }
}