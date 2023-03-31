package is.takeaway;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import vinnsla.Customer;

import java.io.IOException;

public class CustomerDialog extends Dialog<Customer> {
    @FXML
    private TextField fxName;
    @FXML
    private TextField fxAddress;

    private Customer customer;

    /**
     * smiður fyrir dialog, hefur ýmsar hjálparaðfeðir, result converter skilar viðskiptavin hlut ef ýtt er á "í lagi"
     *
     * @param v tómur viðskiptavinur sem við settum með smiðnum
     */
    public CustomerDialog(Customer v) {
        customer = v;
        setDialogPane(readCustomerDialog());
        //iLagiRegla();

        setPropertyBinding();

        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                return customer;
            } else {
                return null;
            }
        });
    }

    /**
     * bindur textfieldin við viðskiptavin hlutina
     */
    private void setPropertyBinding() {
        fxName.textProperty().bindBidirectional(customer.nameProperty());
        fxAddress.textProperty().bindBidirectional(customer.addressProperty());
    }

    /**
     * hjálparaðferð til að les inn dialog
     *
     * @return
     */
    private DialogPane readCustomerDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer-view.fxml"));
        try {
            fxmlLoader.setController(this);
            DialogPane dialogPane = fxmlLoader.load();
            //fxmlLoader.setRoot(this);
            return dialogPane;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
