package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Integer> listInteger = new LinkedList<Integer>();

        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(3);
        listInteger.add(2);

        System.out.println(listInteger);

        System.out.println(listInteger.contains(7));

        listInteger.add(0,7);
        System.out.println(listInteger);

        Collections.sort(listInteger);
        System.out.println(listInteger);

        listInteger.remove(0);
        System.out.println(listInteger);


        System.out.println();
        List<Integer> listInteger2 = new ArrayList<Integer>();
        listInteger2.add(100);
        listInteger2.addAll(listInteger);
        System.out.println(listInteger2);


        List<Integer> numereImpare = new LinkedList<Integer>();
        for (int i = 0; i < 100 ; i++) {

            if (i % 2 != 0) {

                numereImpare.add(i);
            }
        }

        System.out.println(numereImpare);


    }
}
