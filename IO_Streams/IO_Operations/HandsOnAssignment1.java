import java.io.File;
import java.util.Scanner;

class HandsOnAssignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the file name");
            String fileName = sc.nextLine();

            System.out.println("Enter the character to be counted");
            char ch = Character.toLowerCase(sc.next().charAt(0));

            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int count = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }

            fileScanner.close();

            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}