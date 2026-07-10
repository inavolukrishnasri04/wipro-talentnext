import java.util.Scanner;

public class HandsOnAssignment7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        if (str.startsWith("x"))
            str = str.substring(1);

        if (str.endsWith("x"))
            str = str.substring(0, str.length() - 1);

        System.out.println(str);

        sc.close();
    }
}