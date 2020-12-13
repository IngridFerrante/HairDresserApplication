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
    // constructor, to initialize the components 
    // with default values 
    public ClientCheckBookingsController(){
        this.clientCheckBookingsView = new ClientCheckBookingsView(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Your Booking")){  
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
