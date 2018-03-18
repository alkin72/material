package material;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import material.view.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {

            /* Старый вариант
            Parent root = null;
            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../resources/mainwindow.fxml"));
            */

            //Создание загрузчика и подключение файла fxml
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../../resources/mainwindow.fxml"));

            //Загрузка окна
            primaryStage.setTitle("Материалы");
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.show();

            // Даём контроллеру доступ к главному приложению.
            Controller controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Для теста
        System.out.println("Привет!!!");

        //Подключаем слой данных
        Datalay datalay = new Datalay();

        try {

            //Попытка подключения к базе данных

            Connection con = datalay.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM edinica");



            while (rs.next()){


                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
               // System.out.println(rs.getString(3));
                System.out.println("---------------------");
            }

            datalay.ConnectionClose();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }



}
