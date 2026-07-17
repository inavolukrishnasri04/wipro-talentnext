import java.util.Scanner;

public class SecondLastDigit {

    public static int getSecondLastDigit(int num) {

        num = Math.abs(num);

        if (num < 10) {
            return -1;
        }

        return (num / 10) % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = getSecondLastDigit(num);

        System.out.println("Second Last Digit = " + result);

        sc.close();
    }
}