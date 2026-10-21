package team.taskapp.views;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import team.taskapp.ui.TaskLabel;
import team.taskapp.utils.fileUtils;

public class MainView extends View{

    private final VBox root = new VBox();

    @Override
    public Parent getRoot() {
        return root;
    }

    @Override
    public void onShow() {
        root.getChildren().add(fileUtils.loadFXML( MainView.class ));
        //Handle action events from child nodes
        root.addEventHandler(ActionEvent.ACTION, e -> {
            //If the event was fired by a button
            if (e.getTarget() instanceof Button btn) {
                //If the button is a task label
                //TODO this will probably need to change once we task labels have more buttons
                if (btn.getParent() instanceof TaskLabel task) {
                    //Delete the task label
                    ((Pane) task.getParent()).getChildren().remove(task);
                }
            }
        });
    }
}
