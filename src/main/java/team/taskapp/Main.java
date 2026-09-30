package team.taskapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label message = new Label("Welcome to our Taks App!");

        Button button = new Button("Click me");
        button.setOnAction(event ->
                message.setText("Your JavaFx app is working!")
        );

        VBox layout = new VBox(15);
        layout.getChildren().addAll(message, button);
        layout.setStyle("-fx-padding: 25; -fx-alignment: center;");

        Scene scene = new Scene(layout, 500, 300);

        stage.setTitle("Task App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}