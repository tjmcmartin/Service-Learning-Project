package team.taskapp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import team.taskapp.views.View;

import java.io.IOException;

public class fileUtils {

    public static Parent loadFXML(String path) {
        try {
            FXMLLoader loader = new FXMLLoader(fileUtils.class.getResource(path));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Failed to loadFXML FXML: "+path, e);
        }
    }

    //TODO probably generalize this later?  This is really specific use case,
    //and the function name doesn't really reflect that?
    public static String getFilePath(Class<? extends View> clazz) {
        return "/views/" + clazz.getSimpleName() + ".fxml";
    }

}
