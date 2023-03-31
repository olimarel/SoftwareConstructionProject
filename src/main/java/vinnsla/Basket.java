package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ListChangeListener;

public class Basket extends Menu {
    private IntegerProperty totalPrice = new SimpleIntegerProperty();

    /**
     * smiður fyrir Karfa, inniheldur changelistener sem uppfærir heildarverð körfu
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

    public IntegerProperty totalPriceProperty() {
        return totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice.get();
    }
}
