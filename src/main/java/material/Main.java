package material;




import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("../../resources/mainwindow.fxml"));
            primaryStage.setTitle("Материалы");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Привет!!!");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
