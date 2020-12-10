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
public class ClientMakeBookingController extends JFrame implements ActionListener { 
  
    ClientMakeBookingView clientMakeBookingView;
    // constructor, to initialize the components 
    // with default values 
    public ClientMakeBookingController() 
    { 
        this.clientMakeBookingView = new ClientMakeBookingView (this);
    
    } 
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    {

        
        
    }
} 
  
// Driver Code - main method to unable seeing the page individually
class ClientBooking2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        ClientMakeBookingController makeBookController = new ClientMakeBookingController(); 
    } 
}
