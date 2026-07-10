import java.util.ArrayList;
import java.util.StringJoiner;

public class HandsOnAssignment1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("siva");
        names.add("vidya");
        names.add("suri");
        names.add("sankar");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for(String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}