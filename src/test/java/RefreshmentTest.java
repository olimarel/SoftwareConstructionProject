// Compare this snippet from src/main/java/vinnsla/Veitingar.java:

import org.junit.Before;
import org.junit.Test;
import vinnsla.Refreshments;

public class RefreshmentTest {
    private Refreshments veiting;

    @Before
    public void constructVeiting() {
        veiting = new Refreshments("Margharita", 1500);
    }

    @Test
    public void testToString() {
        assert veiting.toString().equals("Margharita, 1500 kr.");
    }

    @Test
    public void testGetVerd() {
        assert veiting.getPrice() == 1500;
    }

    @Test
    public void testGetVeiting() {
        assert veiting.getRefreshment().equals("Margharita");
    }

    @Test
    public void testVerdProperty() {
        assert veiting.priceProperty().get() == 1500;
    }

}
