/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capalogica;

import java.sql.*;
import model.connectionsql;

public class Usuario {
    connectionsql objConectar = new connectionsql();
    ResultSet resultado = null;
    
    public boolean validarVigencia(String usuario) throws Exception{
        String query = "SELECT ESTADO FROM USUARIO WHERE NOMBREUSU='"+usuario+"'";
        
        try{
            resultado = objConectar.consultarBD(query);
            while(resultado.next())
          {
              return resultado.getBoolean("ESTADO");
                       
          }      
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return false;
    }   
}
