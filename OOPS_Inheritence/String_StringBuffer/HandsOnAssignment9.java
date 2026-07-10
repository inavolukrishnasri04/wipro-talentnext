import java.util.Scanner;

public class HandsOnAssignment9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        String result = "";

        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            result += s1.charAt(i);
            result += s2.charAt(i);
        }

        if (s1.length() > s2.length())
            result += s1.substring(min);
        else
            result += s2.substring(min);

        System.out.println(result);

        sc.close();
    }
}