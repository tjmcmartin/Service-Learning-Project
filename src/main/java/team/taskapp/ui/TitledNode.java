package team.taskapp.ui;

import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TitledNode<T extends Control> extends VBox {

    private final Label title;
    private final T node;

    TitledNode(T node, String labelText) {
        this.node = node;
        this.title = new Label(labelText);

        this.getChildren().addAll(title, node);
    }

    public T getNode() {
        return node;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }
    public String getTitle() {
        return title.getText();
    }
}
