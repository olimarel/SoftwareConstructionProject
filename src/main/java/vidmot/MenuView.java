package vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import vinnsla.Menu;
import vinnsla.Refreshments;

public class MenuView extends ListView<Refreshments> {
    private Menu menu;

    /**
     * constructor for the menu on main menu
     */
    public MenuView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("order-view.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        menu = new Menu();
        menu.setItems();
        setItems(menu.getRefreshments());
    }
}
