/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

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
    // constructor, to initialize the components 
    // with default values 
    public CheckOrMakeBookController() 
    { 
        this.checkOrMakeBookView = new CheckOrMakeBookView (this);
    
    } 
  
//    // method actionPerformed() 

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Make a Book")){  
            new ClientAndHairdresserMakeBookingController();
        
    } else {  
            new clientBookings();
        
    }
    }
} 
  
// Driver Code - main method to unable seeing the page individually
class CheckOrBookClient { 
  
    public static void main(String[] args) throws Exception 
    { 
        CheckOrMakeBookController checkorbookController = new CheckOrMakeBookController(); 
    } 
}
