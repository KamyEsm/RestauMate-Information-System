package com.example.restaumate_information_system_GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomePageController implements Initializable {
    private Stage stage;
    @FXML
    private Label WelcomeError;
    public void AdminManager(ActionEvent actionEvent) {
        if(!LoginPageController.GetOwner()) {
            WelcomeError.setText("You are not Owner");
            return;
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/AdminPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void FoodManager(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/FoodPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void MemberManager(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/MemberPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void TableManager(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/TablePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = StartApplication.getPrimaryStage();
    }
}
