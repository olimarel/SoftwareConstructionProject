package is.takeaway;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import vinnsla.Matsedill;
import vinnsla.Veitingar;

public class MatsedillView extends ListView<Veitingar> {
    private Matsedill m;

    public MatsedillView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pontun-view.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        m = new Matsedill();
        m.setjaGogn();
        setItems(m.getVeitingar());
    }
}
