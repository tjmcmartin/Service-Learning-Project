package team.taskapp.views;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import team.taskapp.ui.AddTaskWindow;
import team.taskapp.ui.TaskLabel;

public class MainViewController {

    @FXML
    private VBox taskList;

    @FXML
    private void addTask() {
        //TODO change this to actually add tasks
        AddTaskWindow window = new AddTaskWindow();
        window.showAndWait();
        if (window.getTaskName() != null) {
            taskList.getChildren().add(new TaskLabel(window.getTaskName()));
        }
    }

}
