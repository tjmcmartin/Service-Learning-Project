package team.taskapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Class for the main application window
public class Main extends Application {
    //function that is called when the application is initially run
    //innitial set-up stuff should probably go here
    @Override
    public void start(Stage stage) throws Exception {

        //Most of this stuff is just demo nonesense and
        //messing around with how JavaFX UI works

        //This creates a simple text label
        Label message = new Label("Welcome to our Taks App!");

        //This creates a button
        Button button = new Button("Click me");
        //This is what happens when the button is clicked
        button.setOnAction(event -> {
            //This changes the message Label we create earierl
            message.setText("Your JavaFx app is working!");
        });

        //This creates a second button
        Button button2 = new Button("Create Popup");
        //This is what runs when the second button is pressed
        button2.setOnAction(event -> {
            //This creates a small informational popup window that does absolutely nothing
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Popup!");
            alert.setHeaderText("Something goes here ig");
            alert.setContentText("This is where I would give you some information");
            alert.showAndWait();
        });

        //This creates an empty layout object
        VBox layout = new VBox(15);
        //This adds all of our objects to the empty layout object
        layout.getChildren().addAll(message, button, button2);
        //This gives a style to the layout
        //This is also probably what would get replaced if we wanted to use css
        //I would have to look into more how that works
        layout.setStyle("-fx-padding: 25; -fx-alignment: center;");

        //This creates a scene for our layout object
        //What that does, I'm not 100% sure.
        Scene scene = new Scene(layout, 500, 300);

        //this finalizes some things about our application window, then shows it
        stage.setTitle("Task App");
        stage.setScene(scene);
        stage.show();

        //This ensures that the window is created at the front of the screen
        //even if the OS tries to ignore the window
        stage.setAlwaysOnTop(true);
        stage.setAlwaysOnTop(false);
    }

    //This is the main function that is required for the java programming language
    //similar to C
    public static void main(String[] args) {
        launch(args);
    }
}