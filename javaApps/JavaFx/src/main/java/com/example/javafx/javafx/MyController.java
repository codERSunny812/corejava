package com.example.javafx.javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MyController<selected> implements Initializable {
 @FXML

    public Label welcomeid;
 @FXML

 public ChoiceBox<String> choiceBox;
choiceBox.getSelectionModel().selected ItemProperty(). addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            System.out.println(newValue);
        }
    });

 @FXML
 public TextField userInputField;

 @FXML
 public Button convertButon;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

choiceBox.getItems().add("celcius to fahrenhiet ");
        choiceBox.getItems().add(" fahrenhiet to celcius ");
        convertButon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("bbutton clicked ");
            }
        });
    }
}
