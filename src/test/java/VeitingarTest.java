// Compare this snippet from src/main/java/vinnsla/Veitingar.java:

import org.junit.Before;
import org.junit.Test;
import vinnsla.Veitingar;

public class VeitingarTest {
    private Veitingar veiting;

    @Before
    public void constructVeiting() {
        veiting = new Veitingar("Margharita", 1500);
    }

    @Test
    public void testToString() {
        assert veiting.toString().equals("Margharita, 1500 kr.");
    }

    @Test
    public void testGetVerd() {
        assert veiting.getVerd() == 1500;
    }

    @Test
    public void testGetVeiting() {
        assert veiting.getVeiting().equals("Margharita");
    }

    @Test
    public void testVerdProperty() {
        assert veiting.verdProperty().get() == 1500;
    }

}
