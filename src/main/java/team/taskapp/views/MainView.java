package team.taskapp.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import team.taskapp.ui.AddTaskWindow;
import team.taskapp.utils.fxmlLoader;

import java.io.IOException;

public class MainView extends View{

    private final VBox root = new VBox();

    @Override
    public Parent getRoot() {
        return root;
    }

    @Override
    public void onShow() {
        root.getChildren().add(fxmlLoader.load("/views/MainView.fxml"));
    }
}
