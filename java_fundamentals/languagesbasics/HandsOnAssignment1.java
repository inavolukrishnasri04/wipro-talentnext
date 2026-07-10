class HandsOnAssignment1 {
    public static void main(String[] args) {

        if (args.length == 2) {
            System.out.println(args[0] + " Technologies " + args[1]);
        } else {
            System.out.println("Please pass two command line arguments");
        }
    }
}