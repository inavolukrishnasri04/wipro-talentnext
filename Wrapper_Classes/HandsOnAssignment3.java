import java.util.Scanner;

class HandsOnAssignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);

        sc.close();
    }
}