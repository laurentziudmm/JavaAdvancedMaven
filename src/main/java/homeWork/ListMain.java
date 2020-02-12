package homeWork;

import java.util.ArrayList;
import java.util.Collections;

public class ListMain {
    public static void main(String[] args) {

        /**
         * Lists with strings:
         *
         * 1. Create an ArrayList list1 with strings
         * and add the following values: Green, Red, Blue.
         * 2. Add value Yellow on the first position of the list.
         *
         * 3. Print the list.
         *
         * 4. Print the size of the list.
         *
         * 5. Sort the list using Collections.sort() method.
         *
         * 6. Print the list.
         *
         * 7. Check if value Blue is contained in the list and print the result.
         *
         * 8. Create another ArrayList list2 with strings and add the following values: White, Black.
         *
         * 9. Check if list1 contains list2 - use method containsAll(). Print the result.
         *
         * 10. Add list2 to list1 - use method addAll().
         * 11. Print list1.
         * 12. Remove value Red from list1. Print the list1.
         *
         * 13. Iterate over list1 and print each value on a new line.
         * Use Method2 from  https://www.geeksforgeeks.org/iterating-arraylists-java/.
         *
         * 14. What if instead of ArrayList in above exercises we use LinkedList?
         * Is it still going to work the same?
         */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Green");
        list1.add("Red");
        list1.add("Blue");
        list1.add(0, "Yellow");

        System.out.println("Print the list \n" + list1 + "\n");

        int size = list1.size();
        System.out.println("Print the size of the list\n" + size + "\n");

        Collections.sort(list1);
        System.out.println("Collections Sort Print List \n" + list1 + "\n");

        System.out.println("list1 Contains Blue \n" + list1.contains("Blue") + "\n");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("White");
        list2.add("Black");

        System.out.println("list1 Contains list2 \n" + list1.containsAll(list2) + "\n");

        list1.addAll(list2);
        System.out.println("Add list2 to list 1 \n" + list1 + "\n");

        list1.remove("Red");
        System.out.println("Remove Red from list1 \n" + list1 + "\n");


        for (String i : list1) {
            System.out.print(i + "\n");
        }

        System.out.println(" \nWith LinkedList We Have The Same Result");
    }
}
