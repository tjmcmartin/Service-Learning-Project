package team.taskapp.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class AddTaskWindow extends Stage {

    private String name;

    public AddTaskWindow() {
        setTitle("Add a Task");
        setWidth(500);
        setHeight(300);

        Label message = new Label("Enter a name for you task");
        TextField nameField = new TextField("Task Name");
        Button confirm = new Button("Add Task");
        confirm.setOnAction(e -> {
            name = nameField.getText();
            close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(message, nameField, confirm);

        Scene scene = new Scene(layout, 300, 500);
        setScene(scene);
    }

    public String getTaskName() {
        return name;
    }

}
