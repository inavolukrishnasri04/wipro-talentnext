import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOnAssignment4 {

    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Rahul", 987654321);
        contactList.put("Anitha", 987654322);
        contactList.put("Kiran", 987654323);

        System.out.println(contactList.containsKey("Rahul"));

        System.out.println(contactList.containsValue(987654322));

        Iterator<Map.Entry<String, Integer>> itr =
                contactList.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}