import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 10, 34};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}