public class HandsOnAssignment3 {

    public static void main(String[] args) {

        PrimeInterface pi = PrimeCheck::new;

        pi.check(29);
        pi.check(30);
    }
}