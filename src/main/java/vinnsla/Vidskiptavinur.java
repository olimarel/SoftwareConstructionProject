package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vidskiptavinur {
    private StringProperty nafn = new SimpleStringProperty();
    private StringProperty heimilisfang = new SimpleStringProperty();


    public Vidskiptavinur(String nafn, String heimilisf) {
        this.nafn.set(nafn);
        heimilisfang.set(heimilisf);
    }

    public String getNafn() {
        return nafn.get();
    }

    public StringProperty nafnProperty() {
        return nafn;
    }

    public StringProperty heimilisfangProperty() {
        return heimilisfang;
    }
}
