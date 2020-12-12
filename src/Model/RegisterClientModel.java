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
import controller.RegisterClientController;


//import java.util.List;

/**
 *
 * @author Kelly
 */
public class RegisterClientModel {   
    // link to the database
    private String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
    // user to query DB to insert, delete and update
    private String user = "Ingrid_2019411";
    private String password = "2019411";
    
    public RegisterClientModel() {
        
    }
     
    // create an user in the database, return a string null if there are no error, otherwise return
    // the message from database
    public Boolean registerClient(User newUser) {
        
                 String sql = "INSERT INTO userClient (first_name, last_name, email, phone_number, password) "
                     + "VALUES ('" + newUser.getfName() + "','" + newUser.getlName() 
                     + "','" + newUser.getEmail() + "','" + newUser.getPhoneNumber()
                     + "','" + newUser.getPassword()+ "')";
        
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
class RegistrationClient1 { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registermodel = new RegisterClientController(); 
    } 
}