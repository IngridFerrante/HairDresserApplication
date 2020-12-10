/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kelly
 */
public class LoginModel {
    
    public boolean login(User user){
        
        boolean result = false;
        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Kelly_2019375?useSSL=false";
            String dbUser = "Kelly_2019375";
            String dbPassword = "2019375";
            String query = "SELECT * FROM user WHERE username = '" + user.getUn() + "' AND password = '" + user.getPw() + "';";

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

//    // get an user from emailAddress hairdresser or 
     //
//    public User getUser(String email) {
//        
//        String query = "SELECT * FROM user WHERE email = '" + email + "';";
//        String firstName, lastName, phoneNumber, type, passwordUser, location;
//        User userResult = null;
//        
//        try {
//                    
//            // Get a connection to the database
//            Connection conn = DriverManager.getConnection(dbServer, user, password);
//            
//            // Get a statement from the connection
//            Statement stmt = conn.createStatement();
//
//            // Execute the query
//            ResultSet rs = stmt.executeQuery(query);
//
//            // Loop through the result set
//            if (rs.next()) {
//                
//                firstName = rs.getString("first_name");
//                lastName = rs.getString("last_name");
//                phoneNumber = rs.getString("phone_number");
//                type = rs.getString("type");
//                passwordUser = rs.getString("password");
//                location = rs.getString("location");
//                        
//                userResult = new User(email, firstName, lastName, phoneNumber, type, passwordUser, location);
//                
//            }
//
//            // Close the result set, statement and the connection
//            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (SQLException se) {
//            
//            // Loop through the SQL Exceptions
//            while (se != null) {
//                System.out.println("State  : " + se.getSQLState());
//                System.out.println("Message: " + se.getMessage());
//                System.out.println("Error  : " + se.getErrorCode());
//
//                se = se.getNextException();
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        
//        return userResult;
//                
//    }