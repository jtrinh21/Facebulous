/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebulus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trinh
 */
public class Connecttion {
    
    Connection conn = null;
   
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/face_recog", "root", "");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connecttion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connecttion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
            
}
