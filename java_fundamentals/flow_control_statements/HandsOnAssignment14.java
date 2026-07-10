import java.util.Scanner;

public class HandsOnAssignment14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (; num > 0; num = num / 10) {
            sum = sum + (num % 10);
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}