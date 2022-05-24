package idata2001.wargames.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class WarGamesApp extends Application {

    private Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("wargames.fxml"));
            Parent root = fxmlLoader.load();
            Controller mainWindowController = fxmlLoader.getController();
            Scene scene = new Scene(root, 1070, 800);
            primaryStage.setTitle("WarGames");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            logger.severe("ERROR:"  + e.getMessage());
        }
    }
}
