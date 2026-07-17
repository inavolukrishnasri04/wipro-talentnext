import java.util.Scanner;

public class IsEven {

    public static int isEven(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = isEven(num);

        System.out.println("Result = " + result);

        sc.close();
    }
}