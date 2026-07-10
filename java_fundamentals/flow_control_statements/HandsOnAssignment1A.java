class HandsOnAssignment1A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}