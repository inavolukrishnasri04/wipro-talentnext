import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

        int[] arr = {23, 12, 45, 67, 89, 10, 5};

        Arrays.sort(arr);

        System.out.println("Smallest 1 = " + arr[0]);
        System.out.println("Smallest 2 = " + arr[1]);

        System.out.println("Largest 2 = " + arr[arr.length - 2]);
        System.out.println("Largest 1 = " + arr[arr.length - 1]);
    }
}