import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HandsOnAssignment5 {

    TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public TreeMap<String, String> swapKeyValue() {

        TreeMap<String, String> M2 = new TreeMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        HandsOnAssignment5 obj = new HandsOnAssignment5();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nTreeMap M2");
        System.out.println(obj.swapKeyValue());

        System.out.println("\nCountries");
        System.out.println(obj.toArrayList());
    }
}