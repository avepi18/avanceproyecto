/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class connectionsql {

    private String driver;
    private String url;
    private String user;
    private String password;
    private Connection conexion;
    private Statement sentencia = null;

    public connectionsql() {

        driver = "org.postgresql.Driver";
        url = "jdbc:postgresql://localhost:5432/login";
        user = "postgres";
        password = "123456";
        conexion = null;

    }

    public void conectarBD() throws Exception {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            // st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {
            throw new Exception("Error al conectarse al la BD");
            //Logger.getLogger(connectionsql.class.getName()).log(Level.SEVERE,null,ex);        

        }
    }

//    public ResultSet CONSULTAR(String sql) throws SQLException{
//        return st.executeQuery(sql);  
//    }
//    public int GUARDAR(String sql) throws SQLException{
//        return st.executeUpdate(sql);
//    }
//    public void CERRAR(){
//        try{
//            conexion.close();                    
//        } catch (SQLException ex) {
//            Logger.getLogger(connectionsql.class.getName()).log(Level.SEVERE,null,ex); 
    public boolean getEstado() throws SQLException {
        return conexion.isClosed();

    }

    public void desconectarBD() throws Exception {
        try {
            conexion.close();
        } catch (Exception e) {
            throw new Exception("Error al desconectar BD");
        }
    }

    public ResultSet consultarBD(String query) throws Exception {
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            return sentencia.executeQuery(query);

        } catch (Exception e) {
            throw new Exception("Error al consultar la BD");
        } finally {
            if (getEstado() == false) {
                desconectarBD();
            }

        }
    }

}
