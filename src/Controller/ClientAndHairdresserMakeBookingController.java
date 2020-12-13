/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
     //   to identify different text field
        if(e.getActionCommand().equals("logout")){  
            new HairDresserApplication();
        
        }
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
        }else if(e.getActionCommand().equals("Back")){  
            new controller.CheckOrMakeBookController();
        
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
