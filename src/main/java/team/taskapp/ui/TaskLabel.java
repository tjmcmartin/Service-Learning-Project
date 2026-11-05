package team.taskapp.ui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import team.taskapp.utils.fileUtils;
import team.taskapp.ui.AddTaskWindow.TaskData;

public class TaskLabel extends HBox {

    private Label task;
    private Label dueDate;
    private Button btnComplete;

    private TaskData data;

    public TaskLabel(String task) {
        var data = new TaskData();
        data.name = task;

        this(data);
    }
    public TaskLabel(TaskData data) {
        this.data = data;
        this.task = new Label(data.name);
        this.btnComplete = new Button("\u2713");

        this.getStylesheets().add( fileUtils.loadCSS(this.getClass()) );

        this.getChildren().addAll(this.btnComplete, this.task);

        if (data.dueDate != null) {
            this.dueDate = new Label("Task Due: "+ data.dueDate.toString());
            this.getChildren().add(dueDate);
        }

    }

}
