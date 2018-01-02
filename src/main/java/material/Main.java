package material;




import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            //Parent root = null;
            Parent root = FXMLLoader.load(getClass().getResource("../../resources/mainwindow.fxml"));
            primaryStage.setTitle("Материалы");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Привет!!!");

        Datalay datalay = new Datalay();

        try {

            Connection con = datalay.getConnection();
            Statement statement = con.createStatement();
            statement.execute("SELECT * FROM contragent");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }


}
