

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ViewPrincipalController implements Initializable {
    private Stage stage2;
    
    @FXML
    private Button btnspiderman;
    
    @FXML
    private Button btnprueba;
    
    @FXML
    private void Scene3Action(ActionEvent event) throws IOException{
        
       // loadStage2("/view/Save.fxml",event);

        
       //  Parent root = FXMLLoader.load(getClass().getResource("/view/Save.fxml"));
               
      
      //  FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Save.fxml"));
      //  Parent root = loader.load();
        
      //  Stage stage = new Stage();
      //  stage.setScene(new Scene(root));
      //  stage.setTitle("Scene 3 Window");
      //  stage.show();
       
    
    }
        @FXML
        void pruebaAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Save.fxml"));
        Parent root = loader.load();
        SaveController controller = loader.getController();  
        Scene scene2 = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.show();
        this.stage2.close();   
        
        //Stage stage = new Stage();
        //stage.setScene(new Scene(root));
        //stage.setTitle("Save");
        //stage.show();

    }
      
    public void setStage(Stage primaryStage){
        stage2 = primaryStage;
    
    }



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   
    
}
