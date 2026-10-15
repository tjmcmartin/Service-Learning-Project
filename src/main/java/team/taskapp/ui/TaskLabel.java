package team.taskapp.ui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class TaskLabel extends HBox {

    private Label task;
    private Button btnComplete;

    public TaskLabel(String task) {
        this.task = new Label(task);
        this.btnComplete = new Button("\u2713");

        btnComplete.setOnAction(e -> {
            System.out.println("Task Complete!");
            //TODO this is where this object should get deleted somehow
            //maybe have the parent handle the event for deleting?
        });

        this.getChildren().addAll(this.btnComplete, this.task);


    }

}
