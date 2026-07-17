public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new InvalidAgeException(
                        "Please enter name and age as command line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Age should be a valid integer.");
        }
    }
}