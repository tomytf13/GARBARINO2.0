/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Figueroa
 */
public class Conexion {
    private final String usr="root";
    private final String password = "1234";
    private final String base = "garbarino";
    private final String url = "jdbc:mysql://localhost:3306/garbarino";
    private Connection con;
    
    public Connection getConexion()
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url,usr,password);
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error al conectarse en la base de datos");
    }
    return con;
    }
}
