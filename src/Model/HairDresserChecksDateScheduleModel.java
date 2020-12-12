/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import model.BookAppointment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author 35389
 */
public class HairDresserChecksDateScheduleModel {
    // link to the database
    private String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
    // user to query DB to insert, delete and update
    private String user = "Ingrid_2019411";
    private String password = "2019411";
    
    public HairDresserChecksDateScheduleModel(){
        
    }
    
    public Boolean scheduleHairdresser(BookAppointment schedule){
                
//        String sql = "INSERT INTO bookingAppointment (location, service, date, time,first_name, phone_number) "
//                     + "VALUES ('" + schedule.getDay() + "','" + schedule.getMonth() 
//                     + "','" +  schedule.getYear()+ "')";
        String sql = "Insert";
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
