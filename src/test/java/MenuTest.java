import org.junit.Before;
import org.junit.Test;
import vinnsla.Menu;
import vinnsla.Refreshments;

public class MenuTest {
    private Menu menu;

    @Before
    public void constructMatsedill() {
        menu = new Menu();
        menu.setItems();
    }

    @Test
    public void testGetRefreshmentsSize() {
        assert menu.getRefreshments().size() == 11;
    }

    @Test
    public void testAddRefreshment() {
        assert menu.getRefreshments().size() == 11;

        menu.getRefreshments().add(new Refreshments("Coca Cola", 200));
        assert menu.getRefreshments().size() == 12;
    }

}
