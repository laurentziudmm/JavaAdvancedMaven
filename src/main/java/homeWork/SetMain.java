package homeWork;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetMain {
    public static void main(String[] args) {

        /**
         * Set with strings:
         * 1. Create a HashSet set1 with strings and add the following values: Green, Red, Blue.
         * 2. Print the set.
         *
         * 3. Add values Yellow, Green to the set.
         * 4. Print the set. Why does it contain only one value of Green?
         *
         * 5. Print the size of the set.
         *
         * 6. Check if value Blue is contained in the list and print the result.
         *
         * 7. Create another HashSet set2 with strings and add the following values: White, Black.
         *
         * 8. Check if set1 contains set2 - use method containsAll(). Print the result.
         *
         * 9. Add set2 to set1 - use method addAll().
         * 10. Print set1.
         *
         * 11. Remove value Red from set1. Print the set1.
         *
         * 12. Iterate over set1 and print each value on a new line.
         * Use Method2 from  https://www.geeksforgeeks.org/iterating-arraylists-java/.
         * 13. What if instead of HashSet in above exercises we use LinkedHashSet? Is it still going to work the same?
         */


        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Green");
        set1.add("Red");
        set1.add("Blue");
        System.out.println("Print set1 \n" + set1);
        set1.add("Yellow");
        set1.add("Green");
        System.out.println("Print set1 without green \n" + set1);
        System.out.println("Print the size of set1 \n" + set1.size());
        System.out.println("Print if blue is contained in set1 \n"+set1.contains("Blue"));


        HashSet<String> set2 = new HashSet<>();
        set2.add("White");
        set2.add("Black");
        System.out.println("Check is set1 contains set2 \n" + set1.contains(set2));
        set1.addAll(set2);
        System.out.println("Print set1 + set2 \n" + set1);
        set1.remove("Red");
        System.out.println("Remove Red from set1 \n" + set1);

        System.out.println("Itinerate set1 \n ");
        for (String i : set1) {
            System.out.print(i + "\n");
        }

        System.out.println("\n13 ..Yes will work the same");


    }
}
