/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Axel Tamayo
 */
public class SaveController implements Initializable {
    
    @FXML
    private ComboBox<?> ComboVox;

    @FXML
    private TextField Txt1;

    @FXML
    private TextField Txt2;

    @FXML
    private TextField Txt3;

    @FXML
    private TextField Txt4;

    @FXML
    private Button BtnSave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
