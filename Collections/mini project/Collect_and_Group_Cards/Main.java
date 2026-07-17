import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (map.containsKey(symbol)) {
                map.get(symbol).add(card);
            } else {
                ArrayList<Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            }
        }

        System.out.println("Distinct Symbols are :");

        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (char ch : map.keySet()) {

            ArrayList<Card> list = map.get(ch);

            System.out.println("Cards in " + ch + " Symbol");

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}