package products;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<Product> setProducts = new HashSet<Product>();

        setProducts.add(new Product("Apa",3.7,10.5));
        setProducts.add(new Product("Bomboana",33.7,14.5));
        setProducts.add(new Product("Bomboana",33.7,14.5));
        setProducts.add(new Product("Bomboana",10,14.5));
        setProducts.add(new Product("Bomboana",10,20.5));
        System.out.println(setProducts);
    }
}
