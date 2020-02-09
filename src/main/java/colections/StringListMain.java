package colections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringListMain {
    public static void main(String[] args) {

        List<String> listString = new LinkedList<String>();
        listString.add("George");
        listString.add("Ana");
        listString.add("AAna");
        listString.add("aAna");
        System.out.println(listString);
        listString.add(0,"Bob");
        System.out.println(listString);

        Collections.sort(listString);
        System.out.println(listString);

    }

}
