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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 35389
 */
public class ReviewReadModel {
    // link to the database
    private String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
    // user to query DB to insert, delete and update
    private String user = "Ingrid_2019411";
    private String password = "2019411";
    
    public  ReviewReadModel()
    {
    
    }
    
    public List<customerReviews> getCustomerReview(String reviews){
        
        ArrayList<customerReviews> reviewsList = new ArrayList<customerReviews>();
        //List<customerReviews> reviewsList = new List<customerReviews>();
        
        String sql = "SELECT * FROM customerReviews";
        
        try {
                    
        // Get a connection to the database
         Connection conn = DriverManager.getConnection(dbServer, user, password);
            
          Statement st = conn.createStatement();
          ResultSet srs = st.executeQuery(sql);
          
          while (srs.next()) {
                customerReviews customerReviews = new customerReviews();
                
                customerReviews.setCustomerName(srs.getString("customerName"));
                customerReviews.setReview(srs.getString("review"));
                reviewsList.add(customerReviews);
                
                
            }
          
             System.out.println(reviewsList.size());
                System.out.println(reviewsList.get(1).getCustomerName());
                System.out.println(reviewsList.get(2).getCustomerName());
                System.out.println(reviewsList.get(3).getCustomerName());
                System.out.println(reviewsList.get(4));
            
            //    System.out.println(reviewsList);
        
    }catch(Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
      
    }   
}