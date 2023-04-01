package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
    private StringProperty name = new SimpleStringProperty();
    private StringProperty address = new SimpleStringProperty();


    /**
     * constructor for Customer
     *
     * @param name    name of customer
     * @param address address of customer
     */
    public Customer(String name, String address) {
        this.name.set(name);
        address.set(address);
    }

    /**
     * getter for customer's name
     *
     * @return name
     */
    public String getName() {
        return name.get();
    }

    /**
     * getter for customer nameProperty
     *
     * @return name
     */
    public StringProperty nameProperty() {
        return name;
    }

    /**
     * getter for customer addressProperty
     *
     * @return address
     */
    public StringProperty addressProperty() {
        return address;
    }
}
