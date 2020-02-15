package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainCity {
    public static void main(String[] args) {

        Map<City,String > cityMap = new HashMap<>();

        cityMap.put(new City("Iasi") , "Capitala Moldovei");
        System.out.println(cityMap.get(new City("Iasi")));

        HashSet<City> cityHashSet = new HashSet<>();

        System.out.println();
        cityHashSet.add(new City("Iasi"));
        cityHashSet.add(new City("Iasi"));
        cityHashSet.add(new City("Iasi"));
        System.out.println(cityHashSet);

        //without equals and hashcode Output = [Iasi, Iasi, Iasi]
        //with equals and hashcode Output = [Iasi]

    }
}
