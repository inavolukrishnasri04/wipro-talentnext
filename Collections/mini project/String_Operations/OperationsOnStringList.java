import java.util.ArrayList;
import java.util.Scanner;

public class OperationsOnStringList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;

        do {

            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the item to be inserted : ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search : ");
                    String search = sc.nextLine();

                    if (list.contains(search))
                        System.out.println("Item found in the list.");
                    else
                        System.out.println("Item not found in the list.");

                    break;

                case 3:
                    System.out.print("Enter the item to delete : ");
                    String delete = sc.nextLine();

                    if (list.remove(delete))
                        System.out.println("Deleted successfully");
                    else
                        System.out.println("Item does not exist.");

                    break;

                case 4:
                    System.out.println("The Items in the list are :");

                    if (list.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        for (String s : list)
                            System.out.println(s);
                    }

                    break;

                case 5:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println();

        } while (choice != 5);

        sc.close();
    }
}