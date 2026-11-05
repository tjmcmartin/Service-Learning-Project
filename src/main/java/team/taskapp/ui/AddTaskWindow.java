package team.taskapp.ui;

import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.util.Locale;

public class AddTaskWindow extends Stage {

    private Label message;
    private TextField nameField;
    private ConfirmButtonBar confirmButtonBar;
    private DatePicker dueDate;

    public AddTaskWindow() {

        setTitle("Add a Task");
        setWidth(300);
        setHeight(250);

        message = new Label("Enter a name for you task");
        nameField = new TextField("Task Name");
        confirmButtonBar = new ConfirmButtonBar("Add Task");
        dueDate = new DatePicker();

        confirmButtonBar.setOnConfirm(e -> {
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
        layout.getChildren().addAll(message, nameField, dueDate, confirmButtonBar);

        Scene scene = new Scene(layout, 300, 500);
        setScene(scene);
    }

    public TaskData getTaskData() {
        var data = new TaskData();
        data.name = (nameField.getText().isBlank()) ? null: nameField.getText();
        data.dueDate = dueDate.getValue();

        return data;
    }

    public static class TaskData {
        public String name;
        public LocalDate dueDate;
    }

}
