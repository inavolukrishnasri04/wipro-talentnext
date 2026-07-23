package com.wipro.jdbc;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        if (args.length == 0) {
            printUsage();
            return;
        }

        try {
            int option = Integer.parseInt(args[0]);

            switch (option) {

                case 1:
                    // Insert:
                    // 1 rollNo name standard dob fee

                    if (args.length != 6) {
                        System.out.println(
                                "Usage: 1 rollNo name standard dob fee");
                        return;
                    }

                    int insertRollNo = Integer.parseInt(args[1]);
                    String name = args[2];
                    String standard = args[3];
                    String dob = args[4];
                    double fee = Double.parseDouble(args[5]);

                    dao.insert(insertRollNo, name, standard, dob, fee);
                    break;

                case 2:
                    // Delete:
                    // 2 rollNo

                    if (args.length != 2) {
                        System.out.println("Usage: 2 rollNo");
                        return;
                    }

                    int deleteRollNo = Integer.parseInt(args[1]);
                    dao.delete(deleteRollNo);
                    break;

                case 3:
                    // Modify:
                    // 3 rollNo newFee

                    if (args.length != 3) {
                        System.out.println("Usage: 3 rollNo newFee");
                        return;
                    }

                    int modifyRollNo = Integer.parseInt(args[1]);
                    double newFee = Double.parseDouble(args[2]);

                    dao.modify(modifyRollNo, newFee);
                    break;

                case 4:
                    // Display one or all records

                    if (args.length == 1) {
                        dao.display();
                    } else if (args.length == 2) {
                        int displayRollNo = Integer.parseInt(args[1]);
                        dao.display(displayRollNo);
                    } else {
                        System.out.println("Usage: 4 or 4 rollNo");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
                    printUsage();
            }

        } catch (NumberFormatException e) {
            System.out.println(
                    "Roll number, fee and option must be numeric values.");
        }
    }

    private static void printUsage() {

        System.out.println("Options:");
        System.out.println(
                "1 rollNo name standard dob fee  - Insert");
        System.out.println(
                "2 rollNo                        - Delete");
        System.out.println(
                "3 rollNo newFee                 - Modify fee");
        System.out.println(
                "4 rollNo                        - Display one student");
        System.out.println(
                "4                               - Display all students");
    }
}