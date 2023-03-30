package is.takeaway;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import vinnsla.Karfa;
import vinnsla.Veitingar;
import vinnsla.Vidskiptavinur;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PontunController implements Initializable {
    @FXML
    private MatsedillView matsedill;
    @FXML
    private ListView<Veitingar> fxKarfa;
    @FXML
    private Label fxVidskiptavinur;
    @FXML
    private Label fxVerd;
    private Vidskiptavinur vidskiptavinur;
    private Karfa karfa;
    private IntegerProperty heildarV = new SimpleIntegerProperty();

    /**
     * handler fyrir bæta við körfu takka, lætur einnig changelistener vita af breytingum
     *
     * @param actionEvent
     */
    @FXML
    private void fxSetjaKorfuHandler(ActionEvent actionEvent) {
        Veitingar selected = matsedill.getSelectionModel().getSelectedItem();
        fxKarfa.getItems().add(selected);

        //bæta í Karfa klasann samhliða svo listener geti reiknað heildarverð
        karfa.getVeitingar().add(selected);
    }

    @FXML
    private void fxTakaUrKorfuHandler(ActionEvent actionEvent) {
        Veitingar selected = fxKarfa.getSelectionModel().getSelectedItem();
        fxKarfa.getItems().remove(selected);

        karfa.getVeitingar().remove(selected);
    }

    /**
     * handler fyrir innskráning takka, tékkar hvort notandi hefur nú þegar stofnað aðgang
     *
     * @param actionEvent
     */
    @FXML
    private void fxInnskraningHandler(ActionEvent actionEvent) {
        if (vidskiptavinur == null) {
            nyrVidskiptavinur();
        } else {
            LoginDialog d = new LoginDialog();
            fxVidskiptavinur.setText(vidskiptavinur.getNafn());
        }
    }

    /**
     * hjálparaðferð fyrir handler, opnar nýskráningar dialog
     */
    public void nyrVidskiptavinur() {
        vidskiptavinur = new Vidskiptavinur("", "");
        VidskiptavinurDialog d = new VidskiptavinurDialog(vidskiptavinur);
        Optional<Vidskiptavinur> o = d.showAndWait();
        o.ifPresent(value -> fxVidskiptavinur.setText(value.getNafn()));
    }

    /**
     * tékkar hvort viðskiptavinur sé innskráður, ef true þá færir viðskiptavin yfir í greiðslusíðu
     *
     * @param actionEvent
     */
    @FXML
    private void fxGreidaHandler(ActionEvent actionEvent) {
        if (vidskiptavinur == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Úps!");
            alert.setHeaderText(null);
            alert.setContentText("Vinsamlegast skráðu þig inn");

            alert.showAndWait();
        } else {
            ViewSwitcher.switchTo(View.GREIDSLA);
        }
    }

    public Vidskiptavinur getVidskiptavinur() {
        return vidskiptavinur;
    }

    public IntegerProperty heildarVProperty() {
        return heildarV;
    }

    public void taemaKorfu() {
        fxKarfa.getItems().clear();
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        karfa = new Karfa();

        //bindum heildarverð við körfu, hjálpar okkur við flutning yfir í greidslacontroller
        heildarV.bind(karfa.HeildarVerdProperty());

        //binda label við heildarverðið
        fxVerd.textProperty().bind(karfa.HeildarVerdProperty().asString());
    }
}
