package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Matsedill {
    protected ObservableList<Veitingar> veitingar = FXCollections.observableArrayList();

    /**
     * set aðferð til að populatea matsedillVIew listann
     */
    public void setjaGogn() {
        veitingar.add(new Veitingar("Margharita", 1500));
        veitingar.add(new Veitingar("Pizza Pepperoni", 1990));
        veitingar.add(new Veitingar("Hawaii", 1990));
        veitingar.add(new Veitingar("Meat & Cheese", 2490));
        veitingar.add(new Veitingar("Diavola", 2490));
        veitingar.add(new Veitingar("Pizza Hússins", 2990));
        veitingar.add(new Veitingar("Brauðstangir lítill", 700));
        veitingar.add(new Veitingar("Brauðstangir stór", 900));
        veitingar.add(new Veitingar("Brauðstangir lítill", 700));
        veitingar.add(new Veitingar("Nýbruggað Pepsi Max", 350));
        veitingar.add(new Veitingar("Bjór af krana", 1500));
    }

    public ObservableList<Veitingar> getVeitingar() {
        return veitingar;
    }
}
