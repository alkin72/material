package material.view;

import javafx.fxml.FXML;
import material.Main;

public class Controller {

//    @FXML
//    private Button btnClose;
//    private MenuButton btnMenuClose;

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
