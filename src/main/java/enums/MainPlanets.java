package enums;

public class MainPlanets {
    public static void main(String[] args) {

        Planets[] planets = Planets.values();

        for(Planets planets1:planets) {
            System.out.println(planets1);
        }

        Planets p = Planets.valueOf("JUPITER");

        System.out.println(p);
    }
}
