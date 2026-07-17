import java.util.ArrayList;
import java.util.function.Predicate;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("apple");
        words.add("level");
        words.add("java");
        words.add("radar");
        words.add("hello");
        words.add("malayalam");
        words.add("racecar");
        words.add("world");
        words.add("noon");

        Predicate<String> palindrome = str ->
                str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}