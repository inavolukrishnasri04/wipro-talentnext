import java.util.Scanner;

public class SumOfLastDigits {

    public static int addLastDigits(int input1, int input2) {

        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int input2 = sc.nextInt();

        int result = addLastDigits(input1, input2);

        System.out.println("Sum of Last Digits = " + result);

        sc.close();
    }
}