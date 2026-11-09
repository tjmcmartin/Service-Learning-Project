package team.taskapp.ui;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class AddTaskWindow extends Stage {

    private TaskData data;

    private final TitledNode<TextField> nameField;
    private final TitledNode<DatePicker> dueDate;

    private final ConfirmButtonBar confirmButtonBar;

    public AddTaskWindow() {

        data = new TaskData();

        setTitle("Add a Task");
        setWidth(300);
        setHeight(250);

        nameField = new TitledNode<>(new TextField(), "Enter a name for you task");
        nameField.getNode().setPromptText("Task Name...");
        Platform.runLater(() -> nameField.getNode().requestFocus());

        dueDate = new TitledNode<>(new DatePicker(), "Due Date");

        confirmButtonBar = new ConfirmButtonBar("Add Task");
        confirmButtonBar.setOnConfirm(e -> {
            setTaskData();
            close();
        });
        confirmButtonBar.setOnCancel(e -> {
            close();
        });


//        nameField.setOnAction(e -> {
//            name = nameField.getText();
//            close();
//        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameField, dueDate, confirmButtonBar);

        Scene scene = new Scene(layout, 300, 500);
        setScene(scene);
    }

    private void setTaskData() {
        data.name = (nameField.getNode().getText().isBlank()) ? null: nameField.getNode().getText();
        data.dueDate = dueDate.getNode().getValue();
    }

    public TaskData getTaskData() {
        return data;
    }

    public static class TaskData {
        public String name;
        public LocalDate dueDate;

        TaskData() {
            this.name = null;
            this.dueDate = null;
        }
    }

}
