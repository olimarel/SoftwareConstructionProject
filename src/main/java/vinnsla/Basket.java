package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ListChangeListener;

public class Basket extends Menu {
    private IntegerProperty totalPrice = new SimpleIntegerProperty();

    /**
     * constructor for Basket, contains a changelistener that updates the total price of basket
     */
    public Basket() {
        refreshments.addListener((ListChangeListener<? super Refreshments>) c -> {
            while (c.next()) {
                if (c.wasAdded()) {
                    totalPrice.set(getTotalPrice() + c.getAddedSubList().get(0).getPrice());
                } else if (c.wasRemoved()) {
                    totalPrice.set(getTotalPrice() - c.getRemoved().get(0).getPrice());
                }
            }
        });
    }

    /**
     * getter for totalprice propert
     *
     * @return totalPrice
     */
    public IntegerProperty totalPriceProperty() {
        return totalPrice;
    }

    /**
     * getter for totalPrice int value
     *
     * @return totalPrice
     */
    public int getTotalPrice() {
        return totalPrice.get();
    }
}
