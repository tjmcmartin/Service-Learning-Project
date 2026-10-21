package team.taskapp.ui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import team.taskapp.utils.fileUtils;

public class TaskLabel extends HBox {

    private Label task;
    private Button btnComplete;

    public TaskLabel(String task) {
        this.task = new Label(task);
        this.btnComplete = new Button("\u2713");

        this.getStylesheets().add( fileUtils.loadCSS(this.getClass()) );

        this.getChildren().addAll(this.btnComplete, this.task);


    }

}
