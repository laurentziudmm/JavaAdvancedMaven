import org.junit.Before;
import org.junit.Test;
import products.Product;

public class ProductTest {

    private Product product;


    @Before
    public void init() {
        product = new Product("Bomboana", 23.3, 10.0);
    }

    public int expectedResult;

    @Test
    public void getPriceTest() {
        //given
        //when
        double Price = product.getPrice();
        System.out.println("Price is " + Price);
        //then
        assert Price == expectedResult;
    }

}
