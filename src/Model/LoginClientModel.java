/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kelly
 */
public class LoginClientModel {
    
    
    public boolean login(model.User user){
        
        boolean result = false;
        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
            String dbUser = "Ingrid_2019411";
            String dbPassword = "2019411";
            String query = "SELECT * FROM userClient WHERE email = '" + user.getUn() + "' AND password = '" + user.getPw() + "'";
             //String query = "Select * from customerReviews";
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the result set
            if (rs.next()) {
                result = true;
            }

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return result;
        
    }
    
}

