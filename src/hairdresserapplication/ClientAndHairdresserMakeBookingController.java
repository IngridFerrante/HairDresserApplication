/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Kelly
 */
public class ClientAndHairdresserMakeBookingController extends JFrame implements ActionListener { 
  
    ClientAndHairdresserMakeBookingView clientMakeBookingView;
    ClientAndHairdresserMakeBookingModel clientMakeBookingModel;
    // constructor, to initialize the components 
    // with default values 
    public ClientAndHairdresserMakeBookingController() 
    { 
        this.clientMakeBookingView = new ClientAndHairdresserMakeBookingView (this);
        this.clientMakeBookingModel = new ClientAndHairdresserMakeBookingModel();
    } 
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    {
     //   to identify different text field
        if(e.getActionCommand().equals("logout")){  
            new HairDresserApplication();
        
        }
        else if(e.getActionCommand().equals("Make a Book")){
            String nearbylocation = clientMakeBookingView.getNearByLocation();
            String service = clientMakeBookingView.getlService();
            String date = clientMakeBookingView.getDate();
            String time = clientMakeBookingView.getTime();
            String clientFirstname = clientMakeBookingView.getClientFirstName();
            String clientPhonenumber = clientMakeBookingView.getClientPhoneNumber();
            
            Slot booking = new Slot(nearbylocation, service, date, time, clientFirstname, clientPhonenumber);
            
            boolean result = clientMakeBookingModel.bookingClient(booking);
            
            
            if(result == true)
            {
              
                clientMakeBookingView.setResult("Booking for" + clientFirstname + " was successfully created.");
                
            }
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
