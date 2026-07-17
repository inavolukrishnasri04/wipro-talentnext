import java.util.HashSet;

public class HandsOnAssignment1 {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {

        for (String country : H1) {
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        HandsOnAssignment1 obj = new HandsOnAssignment1();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}