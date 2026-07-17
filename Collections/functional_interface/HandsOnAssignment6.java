import java.util.ArrayList;
import java.util.function.Consumer;

public class HandsOnAssignment6 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("HTML");
        words.add("CSS");
        words.add("Spring");
        words.add("React");
        words.add("Node");
        words.add("Oracle");
        words.add("MongoDB");
        words.add("Git");

        Consumer<ArrayList<String>> consumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };

        consumer.accept(words);

        words.forEach(System.out::println);
    }
}