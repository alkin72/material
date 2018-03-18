package material.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import material.Main;

import java.awt.*;
import java.io.IOException;

public class Controller {

//    @FXML
//    private Button btnClose;
//    private MenuButton btnMenuClose;
    private Button Prihod;

    @FXML
    public void onClickedMetod(){
        System.exit(0);
    }

    @FXML
    public void onMenuCloseMethod(){
        System.exit(0);
    }
    //Сссылка на главное приложение
    private Main mainApp;

    public Controller(){

    }
    @FXML
    public void onClickedPrihod()
    {
        try {
        Stage st;
        st = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../../resources/prihodmateriala.fxml"));

            st.setScene(new Scene(loader.load()));
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
    }
    }

    @FXML
    public void onClickedRashod()
    {
       try {
          Stage st;
          st = new Stage();
          FXMLLoader loader = new FXMLLoader();
          loader.setLocation(Main.class.getResource("../../resources/rashodmateriala.fxml"));
          st.setScene(new Scene(loader.load()));
          st.show();
       }
       catch (IOException e) {
           e.printStackTrace();
       }
    }


    @FXML
    public void openRaschet()
    {
        try {
            Stage st;
            st = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../../resources/receptraschet.fxml"));
            st.setScene(new Scene(loader.load()));
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onClickedGournal()
    {
        try {
            Stage st;
            st = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../../resources/gurnalnakladnyh.fxml"));
            st.setScene(new Scene(loader.load()));
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

   @FXML
    public void initialize(){

    }

    /**-----------------------------------------------------------
     * Вызывается главным приложением, которое даёт на себя ссылку
     */

    public void setMain(Main mainApp){
        this.mainApp = mainApp;
    }
    /**-----------------------------------------------------------*/


}
