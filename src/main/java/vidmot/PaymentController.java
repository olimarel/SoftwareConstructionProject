package vidmot;

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

public class PaymentController implements Initializable {
    @FXML
    private Label fxPaymentTotalPrice;
    @FXML
    private Label fxPaymentAddress;
    @FXML
    private Label fxDelivery;
    @FXML
    private Label fxConfirmation;

    private OrderController orderController;
    private StringProperty custAddress = new SimpleStringProperty();
    private IntegerProperty totalPrice = new SimpleIntegerProperty();

    /**
     * handler for confirm button, empties basket when pressed
     *
     * @param actionEvent
     */
    @FXML
    private void fxConfirmHandler(ActionEvent actionEvent) {
        orderController.emptyBasket();
        fxConfirmation.setText("Pöntun staðfest, takk fyrir viðskiptin!");

    }

    /**
     * returns the user to the main menu
     *
     * @param actionEvent
     */
    @FXML
    private void fxReturnHandler(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.ORDER);
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        orderController = (OrderController) ViewSwitcher.lookup(View.ORDER);

        Random rand = new Random();
        int n = rand.nextInt(61);

        fxDelivery.setText("Áætlaður afhendingartími er: " + n + " mínútur");

        //bindum heimiisfangið við viðskiptavin hlutinn í pöntun controller
        custAddress.bind(orderController.getCustomer().addressProperty());
        fxPaymentAddress.textProperty().bind(custAddress);

        //bindum svo heildarverðið við heildarverðið í pöntuncontroller
        totalPrice.bind(orderController.totalPriceProperty());
        fxPaymentTotalPrice.textProperty().bind(totalPrice.asString());
    }
}
