package team.taskapp.views;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import team.taskapp.App;
import team.taskapp.ui.AddTaskWindow;
import team.taskapp.ui.AddTaskWindow.TaskData;
import team.taskapp.ui.TaskLabel;

import java.time.LocalDate;

public class MainViewController {

    @FXML
    private VBox taskList;

    @FXML
    public void initialize() {
        System.out.println("Initialize instance: " + this);
        System.out.println("Initialize taskList: " + taskList);
    }

    @FXML
    public void addTask() {

        System.out.println("Controller instance: " + this);
        System.out.println("taskList: " + taskList);

        //TODO change this to actually add tasks
        AddTaskWindow window = new AddTaskWindow();
        window.showAndWait();
        TaskData data = window.getTaskData();
        if (data.name != null) {
            taskList.getChildren().add(new TaskLabel(data));
        }
    }

    @FXML
    private void toMyTasks() {
        App.switchView(new TaskView());
    }

}
