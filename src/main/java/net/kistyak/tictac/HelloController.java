package net.kistyak.tictac;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button firstCenter;

    @FXML
    private Button firstDown;

    @FXML
    private Button firstUp;

    @FXML
    private Button newGame;

    @FXML
    private Button secondCenter;

    @FXML
    private Button secondDown;

    @FXML
    private Button secondUp;

    @FXML
    private Button thirdCenter;

    @FXML
    private Button thirdDown;

    @FXML
    private Button thirdUp;

    @FXML
    private Label winText;

    @FXML
    void initialize() {

        firstUp.setOnAction(e -> {
            pressedButton(firstUp);
        });

        secondUp.setOnAction(e -> {
            pressedButton(secondUp);
        });

        thirdUp.setOnAction(e -> {
            pressedButton(thirdUp);
        });

        firstCenter.setOnAction(e -> {
            pressedButton(firstCenter);
        });

        secondCenter.setOnAction(e -> {
            pressedButton(secondCenter);
        });

        thirdCenter.setOnAction(e -> {
            pressedButton(thirdCenter);
        });

        firstDown.setOnAction(e -> {
            pressedButton(firstDown);
        });

        secondDown.setOnAction(e -> {
            pressedButton(secondDown);
        });

        thirdDown.setOnAction(e -> {
            pressedButton(thirdDown);
        });
        
        newGame.setOnAction(e -> {
            firstUp.setDisable(false);
            firstUp.setText("");
            secondUp.setDisable(false);
            secondUp.setText("");
            thirdUp.setDisable(false);
            thirdUp.setText("");

            firstCenter.setDisable(false);
            firstCenter.setText("");
            secondCenter.setDisable(false);
            secondCenter.setText("");
            thirdCenter.setDisable(false);
            thirdCenter.setText("");

            firstDown.setDisable(false);
            firstDown.setText("");
            secondDown.setDisable(false);
            secondDown.setText("");
            thirdDown.setDisable(false);
            thirdDown.setText("");
        });
    }

    public int count = 2;

    public void pressedButton(Button button){
        if (count % 2 == 0) {
            button.setText("O");
        }
        else{
            button.setText("X");
        }
        count++;
        button.setDisable(true);
    }

}
