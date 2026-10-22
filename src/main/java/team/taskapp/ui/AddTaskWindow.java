package team.taskapp.ui;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class AddTaskWindow extends Stage {

    private String name;

    private Label message;
    private TextField nameField;
    private ConfirmButtonBar confirmButtonBar;

    public AddTaskWindow() {

        setTitle("Add a Task");
        setWidth(300);
        setHeight(150);

        message = new Label("Enter a name for you task");
        nameField = new TextField("Task Name");
        confirmButtonBar = new ConfirmButtonBar("Add Task");

        confirmButtonBar.setOnConfirm(e -> {
            name = nameField.getText();
            close();
        });
        confirmButtonBar.setOnCancel(e -> {
            close();
        });

        nameField.setOnAction(e -> {
            name = nameField.getText();
            close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(message, nameField, confirmButtonBar);

        Scene scene = new Scene(layout, 300, 500);
        setScene(scene);
    }

    public String getTaskName() {
        if (name != null && !name.isBlank()) return name;
        return null;
    }

}
