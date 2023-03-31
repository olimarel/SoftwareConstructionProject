import org.junit.Before;
import org.junit.Test;
import vinnsla.Menu;

public class MenuTest {
    private Menu menu;

    @Before
    public void constructMatsedill() {
        menu = new Menu();
        menu.setjaGogn();
    }

    @Test
    public void testGetVeitingarSize() {
        assert menu.getVeitingar().size() == 11;
    }

}
