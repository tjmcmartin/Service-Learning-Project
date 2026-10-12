package team.taskapp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import team.taskapp.views.View;

import java.io.IOException;

public class fxmlUtils {

    public static Parent load(String path) {
        try {
            FXMLLoader loader = new FXMLLoader(fxmlUtils.class.getResource(path));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load FXML: "+path, e);
        }
    }

    public static String getFilePath(Class<? extends View> clazz) {
        return "/views/" + clazz.getSimpleName() + ".fxml";
    }

}
