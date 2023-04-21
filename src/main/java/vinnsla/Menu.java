package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Menu {
    protected ObservableList<Refreshments> refreshments = FXCollections.observableArrayList();

    /**
     * set method to populate the MenuView list
     */
    public void setItems() {
        refreshments.add(new Refreshments("Margharita", 1500));
        refreshments.add(new Refreshments("Pizza Pepperoni", 1990));
        refreshments.add(new Refreshments("Hawaii", 1990));
        refreshments.add(new Refreshments("Meat & Cheese", 2490));
        refreshments.add(new Refreshments("Diavola", 2490));
        refreshments.add(new Refreshments("Pizza Hússins", 2990));
        refreshments.add(new Refreshments("Brauðstangir lítill", 700));
        refreshments.add(new Refreshments("Brauðstangir stór", 900));
        refreshments.add(new Refreshments("Brauðstangir lítill", 700));
        refreshments.add(new Refreshments("Nýbruggað Pepsi Max", 350));
        refreshments.add(new Refreshments("Bjór af krana", 1500));
    }

    /**
     * getter for items in menu
     *
     * @return refreshments
     */
    public ObservableList<Refreshments> getRefreshments() {
        return refreshments;
    }
}
