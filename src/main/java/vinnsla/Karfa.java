package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ListChangeListener;

public class Karfa extends Matsedill {
    private IntegerProperty heildarverd = new SimpleIntegerProperty();

    /**
     * smiður fyrir Karfa, inniheldur changelistener sem uppfærir heildarverð körfu
     */
    public Karfa() {
        veitingar.addListener((ListChangeListener<? super Veitingar>) c -> {
            while (c.next()) {
                if (c.wasAdded()) {
                    heildarverd.set(getHeildarverd() + c.getAddedSubList().get(0).getVerd());
                } else if (c.wasRemoved()) {
                    heildarverd.set(getHeildarverd() - c.getRemoved().get(0).getVerd());
                }
            }
        });
    }

    public IntegerProperty HeildarVerdProperty() {
        return heildarverd;
    }

    public int getHeildarverd() {
        return heildarverd.get();
    }
}
