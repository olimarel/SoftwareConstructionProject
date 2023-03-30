package is.takeaway;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GreidslaController implements Initializable {
    @FXML
    private Label fxGreidslaHeildarV;
    @FXML
    private Label fxGreidslaHeimilisf;
    @FXML
    private Label fxAfhending;
    @FXML
    private Label fxStadfesting;

    private PontunController pontunController;
    private StringProperty vHeimilisf = new SimpleStringProperty();
    private IntegerProperty heildarVerd = new SimpleIntegerProperty();

    /**
     * handler fyrir staðfesta takka, tæmir einnig körfu
     *
     * @param actionEvent
     */
    @FXML
    private void fxStadfestaHandler(ActionEvent actionEvent) {
        pontunController.taemaKorfu();
        fxStadfesting.setText("Pöntun staðfest, takk fyrir viðskiptin!");
        
    }

    @FXML
    private void fxTilBakaHandler(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.PONTUN);
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        pontunController = (PontunController) ViewSwitcher.lookup(View.PONTUN);

        Random rand = new Random();
        int n = rand.nextInt(61);

        fxAfhending.setText("Áætlaður afhendingartími er: " + n + " mínútur");

        //bindum heimiisfangið við viðskiptavin hlutinn í pöntun controller
        vHeimilisf.bind(pontunController.getVidskiptavinur().heimilisfangProperty());
        fxGreidslaHeimilisf.textProperty().bind(vHeimilisf);

        //bindum svo heildarverðið við heildarverðið í pöntuncontroller
        heildarVerd.bind(pontunController.heildarVProperty());
        fxGreidslaHeildarV.textProperty().bind(heildarVerd.asString());
    }
}
