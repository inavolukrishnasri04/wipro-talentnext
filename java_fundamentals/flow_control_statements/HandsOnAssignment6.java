class HandsOnAssignment6 {
    public static void main(String[] args) {

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58)
                System.out.println("8.2%");
            else if (age >= 59 && age <= 100)
                System.out.println("9.2%");
        }
        else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58)
                System.out.println("8.4%");
            else if (age >= 59 && age <= 100)
                System.out.println("10.5%");
        }
    }
}