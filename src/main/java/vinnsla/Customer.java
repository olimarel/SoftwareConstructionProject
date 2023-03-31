package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
    private StringProperty name = new SimpleStringProperty();
    private StringProperty address = new SimpleStringProperty();


    public Customer(String name, String heimilisf) {
        this.name.set(name);
        address.set(heimilisf);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty addressProperty() {
        return address;
    }
}
