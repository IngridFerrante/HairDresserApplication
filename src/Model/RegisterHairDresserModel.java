/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.User;
import controller.RegisterClientController;
import controller.RegisterHairDresserController;
//import java.util.List;

/**
 *
 * @author Kelly
 */
public class RegisterHairDresserModel {   
    // link to the database
    private String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
    // user to query DB to insert, delete and update
    private String user = "Ingrid_2019411";
    private String password = "2019411";
    
    public RegisterHairDresserModel() {
        
    }
     
    // create an user in the database, return a string null if there are no error, otherwise return
    // the message from database
    public Boolean registerHairDresser(User newUser) {
        
                 String sql = "INSERT INTO userHairDresser (location, first_name, last_name, email, phone_number, password) "
                     + "VALUES ('" + newUser.getLocation() + "','" + newUser.getfName() + "','" + newUser.getlName() 
                     + "','" + newUser.getEmail() + "','" + newUser.getPhoneNumber()
                     + "','" + newUser.getPassword()+"')";
        
        Boolean result = false;
        
        try {
                    
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);
            
            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            int i = stmt.executeUpdate(sql);
                       
            if(i > 0)
            {
                result = true;
            }
            // Close the result set, statement and the connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return result;
        } 
        
    }
}
        
// Driver Code - main method to unable seeing the page individually
class Registration1 { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterHairDresserController registermodel = new RegisterHairDresserController(); 
    } 
}