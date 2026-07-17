import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HandsOnAssignment1 {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
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

    public HashMap<String, String> swapKyeValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        HandsOnAssignment1 obj = new HandsOnAssignment1();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nMap M2");
        System.out.println(obj.swapKyeValue());

        System.out.println("\nCountries");
        System.out.println(obj.toArrayList());
    }
}