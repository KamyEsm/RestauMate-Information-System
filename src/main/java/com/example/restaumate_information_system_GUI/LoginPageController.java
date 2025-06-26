package com.example.restaumate_information_system_GUI;

import Managers.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPageController {
    @FXML
    private TextField LoginNCode;
    @FXML
    private TextField LoginPass;
    @FXML
    private Label LoginError;
    private Manager manager = new Manager("AdminList");
    private Scene WelcomeScene;
    private boolean Owner;
    public void Login(ActionEvent actionEvent) {
        String NCode = LoginNCode.getText();
        String Pass = LoginPass.getText();
        String search = manager.NSearch(NCode);
        if(search.equals(null)) {
            LoginError.setText("N Error");
            return;
        }
        if(search.indexOf("true")!=-1)
            Owner = true;
        else
            Owner = false;
        String search2 = manager.NSearch(Pass);
        if(search2.equals(null)) {
            LoginError.setText("Pass Error");
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/WelcomePage.fxml"));
        try {
            WelcomeScene = new Scene(loader.load());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        StartApplication.getPrimaryStage().setScene(WelcomeScene);

    }
    public boolean GetOwner() {
        return Owner;
    }
}