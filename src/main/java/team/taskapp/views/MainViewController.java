package team.taskapp.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import team.taskapp.ui.AddTaskWindow;

public class MainViewController {

    @FXML
    private VBox taskList;

    @FXML
    private void onButtonClick() {
        //TODO change this to actually add tasks
        AddTaskWindow window = new AddTaskWindow();
        window.showAndWait();
        taskList.getChildren().add(new Label(window.getTaskName()));
    }

}
