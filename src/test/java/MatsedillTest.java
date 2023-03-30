import org.junit.Before;
import org.junit.Test;
import vinnsla.Matsedill;

public class MatsedillTest {
    private Matsedill matsedill;

    @Before
    public void constructMatsedill() {
        matsedill = new Matsedill();
        matsedill.setjaGogn();
    }

    @Test
    public void testGetVeitingarSize() {
        assert matsedill.getVeitingar().size() == 11;
    }

}
