package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList();

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

    }
}
