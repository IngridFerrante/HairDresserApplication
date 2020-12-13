/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import View.ClientCheckBookingsView;

/**
 *
 * @author Kelly
 */
public class ClientCheckBookingsController extends JFrame implements ActionListener {

    ClientCheckBookingsView clientCheckBookingsView;
    
    
    public ClientCheckBookingsController(){
        this.clientCheckBookingsView = new ClientCheckBookingsView(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //commands to buttons
        if(e.getActionCommand().equals("Your Booking")){  
            new controller.ClientAndHairdresserMakeBookingController();
        
    }else if(e.getActionCommand().equals("Back")){  
            new controller.CheckOrMakeBookController();
        
    }else if(e.getActionCommand().equals("Logout")){  
            new Controller.HairDresserApplicationController();
    
    }else if(e.getActionCommand().equals("Make a new Booking")){  
            new controller.ClientAndHairdresserMakeBookingController();
        
    }

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class clientchecks {
    public static void main(String[] args) throws Exception {
       ClientCheckBookingsController check = new ClientCheckBookingsController();
    }
}
