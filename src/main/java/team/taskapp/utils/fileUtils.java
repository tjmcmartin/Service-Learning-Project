package team.taskapp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import team.taskapp.App;
import team.taskapp.views.View;

import java.io.IOException;

public class fileUtils {

    public static Parent loadFXML(Class<? extends View> clazz) {
        String path = getFilePath(clazz, ".fxml");
        try {
            FXMLLoader loader = new FXMLLoader(fileUtils.class.getResource(path));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Failed to loadFXML FXML: "+path, e);
        }
    }

    public static String loadMainCSS() {
        return App.class.getResource( "/styles.css" ).toExternalForm();
    }

    public static String loadCSS(Class<? extends Parent> clazz) {
        String path = getFilePath(clazz, ".css");
        return App.class.getResource(path).toExternalForm();
    }

     /**
      Finds the resource file in the src/resources folder that matches the path
      of the class clazz.

      @param clazz is the class used to find the file path. The filepath from clazz relative to package should be the same as the path of the file relative to src/resources
      @param extension the file extension of the desired file (e.g. ".css" or ".fxml")
      @return return the absolute path of the resource (e.g. "/views/MainView.css"
     */
    public static String getFilePath(Class<?> clazz, String extension) {

        String path = clazz.getCanonicalName();

        String prefix = "team.taskapp";

        if (path.startsWith(prefix)) {
            path = path.substring(prefix.length());
        }

        path = path.replace(".", "/");
        return path + extension;
    }

}
