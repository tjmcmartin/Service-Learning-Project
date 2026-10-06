package team.taskapp.views;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import team.taskapp.ui.AddTaskWindow;

public class MainView extends View{

    private final VBox root = new VBox();

    @Override
    public Parent getRoot() {
        return root;
    }

    @Override
    public void onShow() {

        //Create a title for the task list header bar
        Label taskHeaderTitle = new Label("Current Tasks:");
        //Create a button on task list header bar to add new tasks
        Button addTask = new Button("+");
        addTask.setOnAction(e -> {
            //TODO change this to actually add tasks
            AddTaskWindow window = new AddTaskWindow();
            window.showAndWait();
            root.getChildren().add(new Label(window.getTaskName()));

        });


        HBox taskHeaderBar = new HBox(100, taskHeaderTitle, addTask);
        VBox taskList = new VBox(taskHeaderBar);

        root.getChildren().addAll(taskList);
        taskList.setStyle("-fx-padding: 25; -fx-alignment: center;");

    }
}
