package org.openjfx.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Alert alerta = new Alert(AlertType.CONFIRMATION);
        alerta.show();
    }

    public static void main(String[] args) {
        launch();
    }

}