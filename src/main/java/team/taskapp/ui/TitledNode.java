package team.taskapp.ui;

import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.lang.reflect.InvocationTargetException;

public class TitledNode<T extends Control> extends VBox {

    private final Label title;
    private final T node;
    TitledNode(T node, String labelText) {
        this.node = node;
        this.title = new Label(labelText);

        this.getChildren().addAll(title, node);
    }

    public static <T extends Control> TitledNode<T> of(Class<T> clazz, String labelText) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();
            return new TitledNode<>(obj, labelText);
        } catch (NoSuchMethodException | InstantiationException |
                 IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException("Failed to instantiate " + clazz.getName(), e);
        }
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
