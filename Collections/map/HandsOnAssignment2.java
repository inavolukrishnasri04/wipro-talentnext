import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        System.out.println(map.containsKey("India"));

        System.out.println(map.containsValue("Tokyo"));

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, String> entry = itr.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}