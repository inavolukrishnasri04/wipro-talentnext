import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("Hero");
        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        System.out.println(hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println("Honda");
        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        System.out.println(honda.getSpeed());
        honda.cdplayer();

        System.out.println();

        Logan logan = new Logan();

        System.out.println("Logan");
        System.out.println(logan.getModelName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getOwnerName());
        System.out.println(logan.speed());
        System.out.println("GPS : " + logan.gps());

        System.out.println();

        Ford ford = new Ford();

        System.out.println("Ford");
        System.out.println(ford.getModelName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getOwnerName());
        System.out.println(ford.speed());
        System.out.println("Temperature : " + ford.tempControl());
    }
}