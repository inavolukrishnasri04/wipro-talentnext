import java.util.Scanner;

public class HandsOnAssignment5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        System.out.println(str.substring(1, str.length() - 1));

        sc.close();
    }
}