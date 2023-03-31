import org.junit.Before;
import org.junit.Test;
import vinnsla.Basket;

public class BasketTest {
    private Basket basket;

    @Before
    public void constructKarfa() {
        basket = new Basket();
    }

    @Test
    public void testHeildarverdProperty() {
        assert basket.totalPriceProperty().get() == 0;
    }

    @Test
    public void testGetHeildarverd() {
        assert basket.getTotalPrice() == 0;
    }
}
