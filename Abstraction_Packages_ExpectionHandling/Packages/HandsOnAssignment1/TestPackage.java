import test.Foundation;

public class TestPackage {

    public static void main(String[] args) {

        Foundation f = new Foundation();

        // The following statements will give compile-time errors
        // because they are not accessible outside the package.

        // System.out.println(f.var1); // private
        // System.out.println(f.var2); // default
        // System.out.println(f.var3); // protected

        // Only public variable is accessible
        System.out.println("var4 = " + f.var4);
    }
}