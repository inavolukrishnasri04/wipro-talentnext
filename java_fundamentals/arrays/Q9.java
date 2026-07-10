public class Q9 {
    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};
        int[] result = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}