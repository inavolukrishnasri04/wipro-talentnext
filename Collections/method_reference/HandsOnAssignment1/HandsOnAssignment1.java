public class HandsOnAssignment1 {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        FactorialInterface fi = obj::factorial;

        System.out.println(fi.factorial(5));
    }
}