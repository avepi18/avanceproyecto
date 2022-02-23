/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;
import capalogica.Usuario;
//import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.util.logging.Level;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ViewLoginController implements Initializable {
    Usuario objUsuario = new Usuario();
    
//    private UserDao model = new UserDao();
    
    @FXML
    private TextField txtUser;
    
    @FXML
    private PasswordField txtPassword;
            
    @FXML
    private Button btnLogin;
    
    
    @FXML
    private void eventKey(KeyEvent event){
    }
    
        

    @FXML
    private void eventAction(ActionEvent event){
        if (txtUser.getText().isEmpty())
          JOptionPane.showMessageDialog(null,"Debe ingresar el usuario");
        else {
            if(txtPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la contraseña");
        
            } else{ 
                            String usuario = txtUser.getText();
                            try{
                               boolean resultado = objUsuario.validarVigencia(usuario);
                               if(resultado==true){
                                 JOptionPane.showMessageDialog(null,"Esta vigente el usuario"); 
                                 
                                 

                          
                               }else{
                                 JOptionPane.showMessageDialog(null,"Dicho usuario no se encuentra en el sistema",
                                                                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                          
                            }                  
                            }catch (Exception ex){
                                 JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage());
                            
                            }                          
                            }
        
        
        }
    }
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    
    
    
    
}


