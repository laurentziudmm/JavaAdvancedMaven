package colections;

import java.util.LinkedList;
import java.util.List;

public class StringListMain {
    public static void main(String[] args) {

        List<String> listString = new LinkedList<String>();
        listString.add("George");
        listString.add("Ana");
        System.out.println(listString);
        listString.add(0,"Bob");
        System.out.println(listString);


    }

}
