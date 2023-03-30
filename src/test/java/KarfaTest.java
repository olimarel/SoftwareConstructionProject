import org.junit.Before;
import org.junit.Test;
import vinnsla.Karfa;

public class KarfaTest {
    private Karfa karfa;

    @Before
    public void constructKarfa() {
        karfa = new Karfa();
    }

    @Test
    public void testHeildarverdProperty() {
        assert karfa.HeildarVerdProperty().get() == 0;
    }

    @Test
    public void testGetHeildarverd() {
        assert karfa.getHeildarverd() == 0;
    }
}
