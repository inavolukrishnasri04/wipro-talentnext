import java.util.Scanner;

public class HandsOnAssignment10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String lastChars = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + lastChars;
        }

        System.out.println("Output: " + result);

        sc.close();
    }
}