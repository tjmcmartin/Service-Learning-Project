package team.taskapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import team.taskapp.ui.AddTaskWindow;

//Class for the main application window
public class Main extends Application {
    //function that is called when the application is initially run
    //innitial set-up stuff should probably go here
    @Override
    public void start(Stage stage) throws Exception {

        App.start(stage);

        }

    //This is the main function that is required for the java programming language
    //similar to C
    public static void main(String[] args) {
        launch(args);
    }
}