/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import related pages, to get their functionalities 
import view.CheckOrMakeBookView;
import controller.ClientAndHairdresserMakeBookingController;
import Controller.ClientCheckBookingsController;
//import related functions, to get their functionalities 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class CheckOrMakeBookController extends JFrame implements ActionListener { 
  
    CheckOrMakeBookView checkOrMakeBookView;
     
    public CheckOrMakeBookController() 
    { 
        this.checkOrMakeBookView = new CheckOrMakeBookView (this);
    
    } 
  
//    // method actionPerformed() 

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // if click the button link to the page that the button was selected
        if(e.getActionCommand().equals("Make a Book")){  
            new ClientAndHairdresserMakeBookingController();
        
    } else if(e.getActionCommand().equals("Your Books")){
             new ClientCheckBookingsController();
        
    }
    else if(e.getActionCommand().equals("Logout")){  
            new Controller.HairDresserApplicationController();
    }
        
        
} 
}
// Driver Code - main method to unable seeing the page individually
class makeouCheck { 
  
    public static void main(String[] args) throws Exception 
    { 
        CheckOrMakeBookController makeBookController = new CheckOrMakeBookController(); 
    } 
}

