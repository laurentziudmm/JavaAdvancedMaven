package map.problems;

import java.util.Comparator;
import java.util.Map;

public class Constants {

    public static final Comparator<String> COMPARATOR_LENGTH = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    public static final Comparator<String> STRING_COMPARATOR = new ComparatorLength();
    //Sunt la fel doar ca prima are implementare dinamica

//    public static final Runnable r = new Runnable() {
//        @Override
//        public void run() {
//
//        }
//    };


    public static final String TEXT = "Lacul, cu o formă alungită, pe direcția nord-vest – sud-est, are o suprafață de 32,6 km² și s-a format după construirea între anii 1950 și 1960 a unui baraj care alimentează hidrocentrala de 210 MW construită în timpul regimului comunist inclusiv cu aportul muncii forțate prestate de deținuți politici. Pentru construcția barajului și amenajarea lacului au fost strămutate 22 de sate din zonă, și peisajul natural a fost drastic schimbat, el fiind declarat rezervație naturală acvatică în 2000.";


}
