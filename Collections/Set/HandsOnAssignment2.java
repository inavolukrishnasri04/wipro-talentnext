import java.util.HashSet;
import java.util.Iterator;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("siva");
        employees.add("sankar");
        employees.add("sri");
        employees.add("vidya");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}