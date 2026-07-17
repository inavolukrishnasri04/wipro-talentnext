import java.util.Iterator;
import java.util.TreeSet;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("India");
        tree.add("USA");
        tree.add("Australia");
        tree.add("Japan");
        tree.add("Germany");

        System.out.println("Reverse Order:");
        System.out.println(tree.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = tree.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String search = "Japan";

        if (tree.contains(search))
            System.out.println("\n" + search + " exists.");
        else
            System.out.println("\n" + search + " does not exist.");
    }
}