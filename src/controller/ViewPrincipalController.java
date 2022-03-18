

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
    private ScrollPane scroll;

    @FXML
    private GridPane grid;
    
    private List<Heroe> heroes = new ArrayList<>();
    private Image image;
    
    
    private List<Heroe> getData(){
        List<Heroe> heroes  = new ArrayList();
        Heroe heroe;
        
       // for(int i=0; i<20; i++){
            heroe = new Heroe();
            heroe.setName("Spiderman");
            heroe.setImageSrc("/imagenes/a.png");
            
            heroe = new Heroe();
            heroe.setName("Capitán América");
            heroe.setImageSrc("/imagenes/b.png");
            
            heroe = new Heroe();
            heroe.setName("Thor");
            heroe.setImageSrc("/imagenes/c.png");
            
            heroe = new Heroe();
            heroe.setName("Hulk");
            heroe.setImageSrc("/imagenes/d.png");
            
            heroe = new Heroe();
            heroe.setName("Black Widow");
            heroe.setImageSrc("/imagenes/e.png");
            
            heroe = new Heroe();
            heroe.setName("Pantera Negra");
            heroe.setImageSrc("/imagenes/f.png");
            
            heroe = new Heroe();
            heroe.setName("Superman");
            heroe.setImageSrc("/imagenes/g.png");
            
            heroe = new Heroe();
            heroe.setName("Batman");
            heroe.setImageSrc("/imagenes/h.png");
            
            heroe = new Heroe();
            heroe.setName("Mujer Maravilla");
            heroe.setImageSrc("/imagenes/i.png");
            
            heroe = new Heroe();
            heroe.setName("Acuaman");
            heroe.setImageSrc("/imagenes/j.png");
            
            heroe = new Heroe();
            heroe.setName("Flash");
            heroe.setImageSrc("/imagenes/k.png");
            
            heroe = new Heroe();
            heroe.setName("Star Lord");
            heroe.setImageSrc("/imagenes/l.png");
            
            heroe = new Heroe();
            heroe.setName("Iro man");
            heroe.setImageSrc("/imagenes/m.png");
            
            heroe = new Heroe();
            heroe.setName("Wolverine");
            heroe.setImageSrc("/imagenes/n.png");
      //  }
        return heroes;
    
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
        
        heroes.addAll(getData());
        int column = 0;
        int row = 0;
        try {
        for(int i=0; i<heroes.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/ViewHeroes.fxml"));
            
                AnchorPane anchorPane = fxmlLoader.load();
           
            
            ViewHeroesController viewHeroesController = fxmlLoader.getController();
            viewHeroesController.setData(heroes.get(i));
            
            if(column == 3){
                column = 0;
                row++;
            
            }
            
            grid.add(anchorPane, column++, row);
            
            grid.setMinWidth(Region.USE_COMPUTED_SIZE);
            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
            grid.setMaxWidth(Region.USE_PREF_SIZE);
            
            grid.setMinHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setMaxHeight(Region.USE_PREF_SIZE);
            
            
            
            
            GridPane.setMargin(anchorPane,new Insets(10, 10, 10, 10));
        }
            
             } catch (IOException ex) {
                Logger.getLogger(ViewPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
              
        
        
        
    }    
    
   
    
}
