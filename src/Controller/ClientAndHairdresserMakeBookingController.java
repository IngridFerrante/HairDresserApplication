/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

// //import related pages, to get their functionalities
import hairdresserapplication.HairDresserApplication;
import model.BookAppointment;
import model.ClientAndHairdresserMakeBookingModel;
import view.ClientAndHairdresserMakeBookingView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Kelly
 */                                                     
public class ClientAndHairdresserMakeBookingController extends JFrame implements ActionListener { 
  
    ClientAndHairdresserMakeBookingView clientandhairdresserMakeBookingView;
    ClientAndHairdresserMakeBookingModel clientandhairdresserMakeBookingModel;
    // constructor, to initialize the components 
    // with default values 
    public ClientAndHairdresserMakeBookingController() 
    { 
            
        this.clientandhairdresserMakeBookingView = new ClientAndHairdresserMakeBookingView (this);
        this.clientandhairdresserMakeBookingModel = new ClientAndHairdresserMakeBookingModel();
    } 
  
    @Override
    public void actionPerformed(ActionEvent e) 
    {
   
        if(e.getActionCommand().equals("logout")){  
            new HairDresserApplication();
        
        } // getting the information to send to the database that pass through the model
        else if(e.getActionCommand().equals("Make a Book")){
            String nearbylocation = clientandhairdresserMakeBookingView.getNearByLocation();
            String service = clientandhairdresserMakeBookingView.getlService();
            String day = clientandhairdresserMakeBookingView.getDay();
            String month = clientandhairdresserMakeBookingView.getMonth();
            String year = clientandhairdresserMakeBookingView.getYear();
            String time = clientandhairdresserMakeBookingView.getTime();
            String clientFirstname = clientandhairdresserMakeBookingView.getClientFirstName();
            String clientPhonenumber = clientandhairdresserMakeBookingView.getClientPhoneNumber();
            
            BookAppointment booking = new BookAppointment(nearbylocation, service, day, month, year, time, clientFirstname, clientPhonenumber);
            
            boolean result = clientandhairdresserMakeBookingModel.bookingClient(booking);
            
            
            if(result == true)
            {
              
                clientandhairdresserMakeBookingView.setResult("Booking for" + clientFirstname + " was successfully created.");
                
            }  
            //control the button back to go back the page
        }else if(e.getActionCommand().equals("Back")){  
            new controller.CheckOrMakeBookController();
        
            //control the button logout to direct to the mainPage 
    }  else if(e.getActionCommand().equals("Logout")){  
            new Controller.HairDresserApplicationController();
    }
        
        } 
        
        
    }
 
  
// Driver Code - main method to unable seeing the page individually
class Booking2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        ClientAndHairdresserMakeBookingController makeBookController = new ClientAndHairdresserMakeBookingController(); 
    } 
}
