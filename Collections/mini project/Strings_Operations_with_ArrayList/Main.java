import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter S1:");
        String s1 = sc.next();

        System.out.println("Enter S2:");
        String s2 = sc.next();

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder result1 = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 1 && j < s2.length()) {
                result1.append(s2.charAt(j));
                j++;
            } else {
                result1.append(s1.charAt(i));
            }
        }
        list.add(result1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String result2 = s1.substring(0, last) + rev
                    + s1.substring(last + s2.length());
            list.add(result2);
        } else {
            list.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (s1.contains(s2)) {
            list.add(s1.replaceFirst(s2, ""));
        } else {
            list.add(s1);
        }

        // 4. Divide S2 into two halves
        int mid;
        if (s2.length() % 2 == 0)
            mid = s2.length() / 2;
        else
            mid = (s2.length() / 2) + 1;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters of S1 present in S2 with *
        StringBuilder result5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1)
                result5.append("*");
            else
                result5.append(ch);
        }

        list.add(result5.toString());

        System.out.println("Output:");
        System.out.println(list);

        sc.close();
    }
}