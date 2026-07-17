import java.util.ArrayList;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Pineapple");
        al.add("Cherry");
        al.add("Guava");
        al.add("Papaya");
        al.add("Kiwi");

        System.out.println("Strings in Reverse:");

        al.forEach(str -> {
            String rev = new StringBuilder(str).reverse().toString();
            System.out.println(rev);
        });
    }
}