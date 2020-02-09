package products;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new LinkedList<>();

        products.add(new Product("Ciocolata",3.7,100.5));
        products.add(new Product("Bomboana",33.7,14.5));
        System.out.println(products.toString());
        System.out.println();

        Collections.sort(products);

        System.out.println(products.contains(new Product("Bomboana",33.7,14.5)));
        System.out.println();

        products.remove(new Product("Bomboana",33.7,14.5));

        System.out.println(products);
        System.out.println();


    }
}
