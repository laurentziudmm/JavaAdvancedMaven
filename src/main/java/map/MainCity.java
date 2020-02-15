package map;

import java.util.HashMap;
import java.util.Map;

public class MainCity {
    public static void main(String[] args) {

        Map<City,String > cityMap = new HashMap<>();

        cityMap.put(new City("Iasi") , "Capitala Moldovei");
        System.out.println(cityMap.get(new City("Iasi")));

    }
}
