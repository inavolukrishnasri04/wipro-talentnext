import java.util.Scanner;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        else
            System.out.println((s1 + s2).toLowerCase());

        sc.close();
    }
}