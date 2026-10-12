package team.taskapp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class fxmlLoader {

    public static Parent load(String file) {
        try {
            FXMLLoader loader = new FXMLLoader(fxmlLoader.class.getResource(file));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load FXML: "+file, e);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
