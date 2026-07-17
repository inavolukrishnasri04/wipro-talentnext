import java.util.ArrayList;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Kiwi");
        al.add("Guava");
        al.add("Papaya");
        al.add("Cherry");
        al.add("Pear");

        System.out.println("Strings with Odd Length:");

        al.forEach(str -> {
            if (str.length() % 2 != 0)
                System.out.println(str);
        });
    }
}