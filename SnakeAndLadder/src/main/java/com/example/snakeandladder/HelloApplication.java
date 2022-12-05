package com.example.snakeandladder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        root=new Group();
        StartGame start=new StartGame();
        root.getChildren().add(start.root);
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("SNAKE AND LADDER");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}