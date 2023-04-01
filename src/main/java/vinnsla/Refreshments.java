package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Refreshments {
    private StringProperty refreshment;
    private IntegerProperty price;

    /**
     * constructor for a single refreshment
     *
     * @param refreshment type of refreshment
     * @param price       price of refreshment
     */
    public Refreshments(String refreshment, int price) {
        this.refreshment = new SimpleStringProperty(refreshment);
        this.price = new SimpleIntegerProperty(price);
    }

    /**
     * updated toString method for UI
     *
     * @return refreshment and price
     */
    public String toString() {
        return refreshment.getValue() + ", " + price.getValue() + " kr.";
    }

    /**
     * getter for refreshment's price
     *
     * @return price
     */
    public int getPrice() {
        return price.get();
    }

    /**
     * getter for refreshment's priceProperty
     *
     * @return priceProperty
     */
    public IntegerProperty priceProperty() {
        return price;
    }

    /**
     * getter for refreshment
     *
     * @return refreshment
     */
    public String getRefreshment() {
        return refreshment.get();
    }
}
