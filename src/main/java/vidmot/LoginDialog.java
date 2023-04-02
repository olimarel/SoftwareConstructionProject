package vidmot;

import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class LoginDialog {

    /**
     * constructs a simple text dialog if customer is already signed up
     */
    public LoginDialog() {
        TextInputDialog t = new TextInputDialog();

        t.setTitle("Innskráning");
        t.setHeaderText("Velkomin/nn/ð aftur");
        t.setContentText("Lykilorð:");

        Optional<String> outcome = t.showAndWait();
        // Birtum svarið á console með því að nota get()
        t.close();
    }
}
