package team.taskapp;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import team.taskapp.views.MainViewController;
import team.taskapp.views.TaskView;

public class MainController {

    @FXML
    public AnchorPane viewContent;

    @FXML
    private void addTask() {
        new MainViewController().addTask();
    }

    @FXML
    private void toTaskView() {
        App.switchView(new TaskView());
    }

    public AnchorPane getMainContent() {
        return viewContent;
    }
}
