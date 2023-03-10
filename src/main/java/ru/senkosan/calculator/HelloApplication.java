package ru.senkosan.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        if (fxmlLoader.getLocation() == null) {
            throw new RuntimeException("Error");
        } else {
            Scene scene = new Scene(fxmlLoader.load(), 320, 250);
            stage.setTitle("Calculator v1");
            stage.setScene(scene);
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}