public class HandsOnAssignment17 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter a number");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}