public class TestLambda {

    public static void main(String[] args) {

        // Addition
        Test t1 = (a, b, c) -> a + b + c;

        // Multiplication
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}