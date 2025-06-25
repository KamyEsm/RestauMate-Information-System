package com.example.restaumate_information_system_GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField LoginNCode;
    @FXML
    private TextField LoginPass;
    @FXML
    private Label LoginError;

    public void Login(ActionEvent actionEvent) {
        String NCode = LoginNCode.getText();
        String Pass = LoginPass.getText();
    }
}