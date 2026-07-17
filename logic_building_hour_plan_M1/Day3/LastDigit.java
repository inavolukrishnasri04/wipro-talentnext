import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int num) {

        return Math.abs(num % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = getLastDigit(num);

        System.out.println("Last Digit = " + result);

        sc.close();
    }
}