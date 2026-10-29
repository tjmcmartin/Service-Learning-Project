package team.taskapp.views;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import team.taskapp.utils.fileUtils;

public class TaskView extends View{

    private final VBox root = new VBox();

    @Override
    public Parent getRoot() {
        return root;
    }

    @Override
    public void onShow() {
        root.getChildren().add(fileUtils.loadFXML( TaskView.class ));
    }
}
