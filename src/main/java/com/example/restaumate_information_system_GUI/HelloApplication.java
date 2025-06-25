package com.example.restaumate_information_system_GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage PrimaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.PrimaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/restaumate_information_system/Login-Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("Restaumate");
        stage.setScene(scene);
        stage.show();
    }
    public static Stage getPrimaryStage() {
        return PrimaryStage;
    }

    public static void main(String[] args) {
        launch();
    }
}