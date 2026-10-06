package team.taskapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import team.taskapp.ui.AddTaskWindow;
import team.taskapp.views.MainView;
import team.taskapp.views.View;

public class App {

    private static Stage stage;
    private static Scene scene;
    
    private static View view;

    public static void start(Stage stg) {
        stage = stg;
        scene = new Scene(new Pane());

        stage.setTitle("Task App");
        stage.setScene(scene);
        stage.show();

        stage.setAlwaysOnTop(true);
        stage.setAlwaysOnTop(false);
        
        switchView(new MainView());
    }
    
    public static void switchView(View newView) {
        if(view != null) {
            view.onHide();
        }

        view = newView;
        scene.setRoot(newView.getRoot());
        newView.onShow();
    }
    
}
