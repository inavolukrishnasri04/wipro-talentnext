import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        Properties states = new Properties();

        states.put("Andhra Pradesh", "Amaravati");
        states.put("Karnataka", "Bengaluru");
        states.put("Tamil Nadu", "Chennai");
        states.put("Kerala", "Thiruvananthapuram");

        Set<Object> keys = states.keySet();

        Iterator<Object> itr = keys.iterator();

        while (itr.hasNext()) {

            Object key = itr.next();

            System.out.println(key + " -> " + states.get(key));
        }
    }
}