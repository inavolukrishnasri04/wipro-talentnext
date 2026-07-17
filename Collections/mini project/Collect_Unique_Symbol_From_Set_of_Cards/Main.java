import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Character> symbolSet = new HashSet<>();
        TreeMap<Character, Card> cards = new TreeMap<>();

        while (symbolSet.size() < 4) {

            System.out.println("Enter a card :");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            if (!symbolSet.contains(symbol)) {
                symbolSet.add(symbol);
                cards.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in 4 cards.");
        System.out.println("Cards in Set are :");

        for (Card c : cards.values()) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}