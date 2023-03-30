package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Veitingar {
    private StringProperty veiting;
    private IntegerProperty verd;

    public Veitingar(String veiting, int verd) {
        this.veiting = new SimpleStringProperty(veiting);
        this.verd = new SimpleIntegerProperty(verd);
    }

    public String toString() {
        return veiting.getValue() + ", " + verd.getValue() + " kr.";
    }

    public int getVerd() {
        return verd.get();
    }

    public IntegerProperty verdProperty() {
        return verd;
    }

    public String getVeiting() {
        return veiting.get();
    }
}
