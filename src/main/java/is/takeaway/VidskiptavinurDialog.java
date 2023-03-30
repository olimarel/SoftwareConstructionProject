package is.takeaway;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import vinnsla.Vidskiptavinur;

import java.io.IOException;

public class VidskiptavinurDialog extends Dialog<Vidskiptavinur> {
    @FXML
    private TextField fxNafn;
    @FXML
    private TextField fxHeimilisf;
    @FXML
    private ButtonType fxILagi;

    private Vidskiptavinur vidskiptavinur;

    /**
     * smiður fyrir dialog, hefur ýmsar hjálparaðfeðir, result converter skilar viðskiptavin hlut ef ýtt er á "í lagi"
     *
     * @param v tómur viðskiptavinur sem við settum með smiðnum
     */
    public VidskiptavinurDialog(Vidskiptavinur v) {
        vidskiptavinur = v;
        setDialogPane(lesaVidskiptavinDialog());
        //iLagiRegla();

        setPropertyBinding();

        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                return vidskiptavinur;
            } else {
                return null;
            }
        });
    }

    /**
     * bindur textfieldin við viðskiptavin hlutina
     */
    private void setPropertyBinding() {
        fxNafn.textProperty().bindBidirectional(vidskiptavinur.nafnProperty());
        fxHeimilisf.textProperty().bindBidirectional(vidskiptavinur.heimilisfangProperty());
    }

    /**
     * hjálparaðferð til að les inn dialog
     *
     * @return
     */
    private DialogPane lesaVidskiptavinDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vidskiptavinur-view.fxml"));
        try {
            fxmlLoader.setController(this);
            DialogPane dialogPane = fxmlLoader.load();
            //fxmlLoader.setRoot(this);
            return dialogPane;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * hjálparaðferð sem óvirkjar í lagi takka ef reitir eru auðir
     */
    private void iLagiRegla() {
        // fletta upp í lagi hnappnum út frá hnappategund
        Node iLagi = getDialogPane().lookupButton(fxILagi);
        iLagi.disableProperty()
                .bind(fxNafn.textProperty().isEmpty()
                        .or(fxHeimilisf.textProperty().isEmpty()));
    }
}
