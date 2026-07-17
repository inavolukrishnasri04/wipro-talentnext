import java.util.TreeSet;

public class HandsOnAssignment4 {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        for (String country : T1) {

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HandsOnAssignment4 obj = new HandsOnAssignment4();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}