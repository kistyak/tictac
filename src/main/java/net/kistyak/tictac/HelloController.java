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
            checker();
        });

        secondUp.setOnAction(e -> {
            pressedButton(secondUp);
            checker();
        });

        thirdUp.setOnAction(e -> {
            pressedButton(thirdUp);
            checker();
        });

        firstCenter.setOnAction(e -> {
            pressedButton(firstCenter);
            checker();
        });

        secondCenter.setOnAction(e -> {
            pressedButton(secondCenter);
            checker();
        });

        thirdCenter.setOnAction(e -> {
            pressedButton(thirdCenter);
            checker();
        });

        firstDown.setOnAction(e -> {
            pressedButton(firstDown);
            checker();
        });

        secondDown.setOnAction(e -> {
            pressedButton(secondDown);
            checker();
        });

        thirdDown.setOnAction(e -> {
            pressedButton(thirdDown);
            checker();
        });
        
        newGame.setOnAction(e -> {

            winText.setText("");

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

    public void checker(){

        // For X
        if(firstUp.getText().equals("X") && secondUp.getText().equals("X") && thirdUp.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }
        if(firstCenter.getText().equals("X") && secondCenter.getText().equals("X") && thirdCenter.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }
        if(firstDown.getText().equals("X") && secondDown.getText().equals("X") && thirdDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }

        if(firstUp.getText().equals("X") && firstCenter.getText().equals("X") && firstDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }
        if(secondUp.getText().equals("X") && secondCenter.getText().equals("X") && secondDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }
        if(thirdUp.getText().equals("X") && thirdCenter.getText().equals("X") && thirdDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }

        if(firstUp.getText().equals("X") && secondCenter.getText().equals("X") && thirdDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }
        if(thirdUp.getText().equals("X") && secondCenter.getText().equals("X") && firstDown.getText().equals("X")){
            winText.setText("X WINS!");
            disableAll();
        }

        // For O
        if(firstUp.getText().equals("O") && secondUp.getText().equals("O") && thirdUp.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
        if(firstCenter.getText().equals("O") && secondCenter.getText().equals("O") && thirdCenter.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
        if(firstDown.getText().equals("O") && secondDown.getText().equals("O") && thirdDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }

        if(firstUp.getText().equals("O") && firstCenter.getText().equals("O") && firstDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
        if(secondUp.getText().equals("O") && secondCenter.getText().equals("O") && secondDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
        if(thirdUp.getText().equals("O") && thirdCenter.getText().equals("O") && thirdDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }

        if(firstUp.getText().equals("O") && secondCenter.getText().equals("O") && thirdDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
        if(thirdUp.getText().equals("O") && secondCenter.getText().equals("O") && firstDown.getText().equals("O")){
            winText.setText("O WINS!");
            disableAll();
        }
    }

    private void disableAll(){
        firstUp.setDisable(true);
        secondUp.setDisable(true);
        thirdUp.setDisable(true);

        firstCenter.setDisable(true);
        secondCenter.setDisable(true);
        thirdCenter.setDisable(true);

        firstDown.setDisable(true);
        secondDown.setDisable(true);
        thirdDown.setDisable(true);
    }

}
