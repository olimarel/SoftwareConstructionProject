package is.takeaway;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import vinnsla.Menu;
import vinnsla.Refreshments;

public class MenuView extends ListView<Refreshments> {
    private Menu m;

    public MenuView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("order-view.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        m = new Menu();
        m.setjaGogn();
        setItems(m.getVeitingar());
    }
}
