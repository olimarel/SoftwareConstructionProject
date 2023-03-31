package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Refreshments {
    private StringProperty refreshment;
    private IntegerProperty price;

    public Refreshments(String refreshment, int price) {
        this.refreshment = new SimpleStringProperty(refreshment);
        this.price = new SimpleIntegerProperty(price);
    }

    public String toString() {
        return refreshment.getValue() + ", " + price.getValue() + " kr.";
    }

    public int getPrice() {
        return price.get();
    }

    public IntegerProperty priceProperty() {
        return price;
    }

    public String getRefreshment() {
        return refreshment.get();
    }
}
