package team.taskapp;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import team.taskapp.utils.fileUtils;
import team.taskapp.views.MainView;
import team.taskapp.views.View;

public class App {

    private static Stage stage;
    private static Scene scene;

    private static AnchorPane content;
    
    private static View view;

    public static void start(Stage stg) {
        stage = stg;
        scene = new Scene(new Pane());
        scene.getStylesheets().add( fileUtils.loadMainCSS() );

        stage.setTitle("Task App");
        stage.setScene(scene);
        stage.show();

        Parent root = fileUtils.loadMainFXML();
        scene.setRoot(root);

        stage.setAlwaysOnTop(true);
        stage.setAlwaysOnTop(false);
        
        switchView(new MainView());
    }

    public static void setMainContent(AnchorPane content) {
        App.content = content;
    }
    
    public static void switchView(View newView) {
        if(view != null) {
            view.onHide();
        }

        view = newView;
        content.getChildren().clear();
        content.getChildren().add(newView.getRoot());
        newView.onShow();
    }
    
}
