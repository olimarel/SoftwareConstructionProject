package is.takeaway;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import vinnsla.Basket;
import vinnsla.Customer;
import vinnsla.Refreshments;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class OrderController implements Initializable {
    @FXML
    private MenuView menu;
    @FXML
    private ListView<Refreshments> fxBasket;
    @FXML
    private Label fxCustomer;
    @FXML
    private Label fxPrice;
    private Customer customer;
    private Basket basket;
    private IntegerProperty totalPrice = new SimpleIntegerProperty();

    /**
     * handler fyrir bæta við körfu takka, lætur einnig changelistener vita af breytingum
     *
     * @param actionEvent
     */
    @FXML
    private void fxPutInBasketHandler(ActionEvent actionEvent) {
        Refreshments selected = menu.getSelectionModel().getSelectedItem();
        fxBasket.getItems().add(selected);

        //bæta í Karfa klasann samhliða svo listener geti reiknað heildarverð
        basket.getVeitingar().add(selected);
    }

    @FXML
    private void fxRemoveFromBasketHandler(ActionEvent actionEvent) {
        Refreshments selected = fxBasket.getSelectionModel().getSelectedItem();
        fxBasket.getItems().remove(selected);

        basket.getVeitingar().remove(selected);
    }

    /**
     * handler fyrir innskráning takka, tékkar hvort notandi hefur nú þegar stofnað aðgang
     *
     * @param actionEvent
     */
    @FXML
    private void fxLoginHandler(ActionEvent actionEvent) {
        if (customer == null) {
            newCustomer();
        } else {
            LoginDialog d = new LoginDialog();
            fxCustomer.setText(customer.getName());
        }
    }

    /**
     * hjálparaðferð fyrir handler, opnar nýskráningar dialog
     */
    public void newCustomer() {
        customer = new Customer("", "");
        CustomerDialog d = new CustomerDialog(customer);
        Optional<Customer> o = d.showAndWait();
        o.ifPresent(value -> fxCustomer.setText(value.getName()));
    }

    /**
     * tékkar hvort viðskiptavinur sé innskráður, ef true þá færir viðskiptavin yfir í greiðslusíðu
     *
     * @param actionEvent
     */
    @FXML
    private void fxPayHandler(ActionEvent actionEvent) {
        if (customer == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Úps!");
            alert.setHeaderText(null);
            alert.setContentText("Vinsamlegast skráðu þig inn");

            alert.showAndWait();
        } else {
            ViewSwitcher.switchTo(View.PAYMENT);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public IntegerProperty totalPriceProperty() {
        return totalPrice;
    }

    public void emptyBasket() {
        fxBasket.getItems().clear();
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        basket = new Basket();

        //bindum heildarverð við körfu, hjálpar okkur við flutning yfir í greidslacontroller
        totalPrice.bind(basket.totalPriceProperty());

        //binda label við heildarverðið
        fxPrice.textProperty().bind(basket.totalPriceProperty().asString());
    }
}
