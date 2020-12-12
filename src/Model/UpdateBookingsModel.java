/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import controller.ClientAndHairdresserMakeBookingController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Kelly
 */
public class UpdateBookingsModel {   
    // link to the database
    private String dbServer = "jdbc:mysql://apontejaj.com:3306/Kelly_2019375?useSSL=false";
    // user to query DB to insert, delete and update
    private String user = "Kelly_2019375";
    private String password = "2019375";
    
    public UpdateBookingsModel() {
        
    }
     
    // create an user in the database, return a string null if there are no error, otherwise return
    // the message from database
    public Boolean bookingClient(model.bookAppoitment booking) {
        
        //java.sql.Date date = java.sql.Date.valueOf(booking.getDate());
        //java.sql.Time time = java.sql.Time.valueOf(booking.getTime());
        
        String sql = "SELECT * FROM bookingAppointment WHERE (day, month, year) "
                     + "VALUES ('" + booking.getDay() + "','" + booking.getMonth() 
                     + "','" + booking.getYear() + "')";
        
      
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
class checkSchedule { 
  
    public static void main(String[] args) throws Exception 
    { 
        UpdateBookingsModel bookingmodel = new UpdateBookingsModel(); 
    } 
}
