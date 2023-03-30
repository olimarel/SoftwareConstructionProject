module is.takeaway {
    requires javafx.controls;
    requires javafx.fxml;


    opens is.takeaway to javafx.fxml;
    exports is.takeaway;
    exports vinnsla;
}
