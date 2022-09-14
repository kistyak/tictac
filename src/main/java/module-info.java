module net.kistyak.tictac {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.kistyak.tictac to javafx.fxml;
    exports net.kistyak.tictac;
}