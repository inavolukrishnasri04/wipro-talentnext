public class HandsOnAssignment2 {

    public static void main(String[] args) {

        DigitInterface di = DigitCount::digitCount;

        System.out.println("Number of digits: " + di.digitCount(123456));
    }
}