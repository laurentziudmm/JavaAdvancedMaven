package products;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private double price;
    private double size;

    public Product(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.size, size) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    public String toString() {
        return name + " are pretul: " + price + " si are " + size;
    }


    public double getPrice() {
        return price;
    }


    @Override
    public int compareTo(Product o) {
        return Double.compare(this.getPrice(),o.getPrice());
    }
}
