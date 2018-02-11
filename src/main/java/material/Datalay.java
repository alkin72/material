package material;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datalay {

    //Подключение к базе данных

    private static final String DB_DRIVER = "org.mysql.driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbabz";
    private static final String DB_USER_NAME = "root";
    private static final String DB_PASSWORD = "";


    public  Connection getConnection() {


        Connection conn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASSWORD);
            System.out.println("Подключение к mySQL - успешно!");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Подключение - ошибка!");
        }
        return conn;

    }

}
