package map;

import java.util.HashMap;
import java.util.Map;

public class Exercices {
    public static void main(String[] args) {

        Map<String,String> mapString = new HashMap<>();

        mapString.put("Iasi" , "Capitala Moldovei");
        System.out.println(mapString.get("Iasi"));

//        mapString.put("Botosani" , "Capitala Moldovei");
        System.out.println(mapString.get("Botosani"));

        mapString.put("Vaslui" , "Oameni Muncitori");
        System.out.println(mapString.get("Vaslui"));

        mapString.put("Iasi" , "Capitala Culturala a Europei 2020");
        System.out.println(mapString.get("Iasi"));

        System.out.println(mapString.keySet());
        System.out.println(mapString.values());

        System.out.println(mapString);


    }
}
