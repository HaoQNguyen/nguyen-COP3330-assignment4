/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Hao Nguyen
 */

// link to Figma GUI mockup
// https://www.figma.com/file/3qZjCsRGFItILLZ14lBQ7a/GUI-Mockup

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("App.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        //stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}