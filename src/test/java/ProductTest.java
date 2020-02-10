import org.junit.Before;
import org.junit.Test;
import products.Product;

public class ProductTest {

    private Product product;


    @Before
    public void init() {
        product = new Product("Bomboana", 23.3, 10.0);
        product = new Product("Apa", 2.5, 100.0);

    }

    @Test
    public void getPriceTest() {

        double Price = product.getPrice();
        System.out.println("Price is " + Price);
    }

    @Test
    public void getNameTest() {

        String name = product.getName();
        System.out.println("Poduct is " + name);
    }

    @Test
    public void getSizeTest() {

        double size = product.getSize();
        System.out.println("Poduct is " + size);
    }
}
