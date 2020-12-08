/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Kelly
 */

public class RegisterClientController extends JFrame implements ActionListener { 
  
    RegisterClientView registerClientView;
    // constructor, to initialize the components 
    // with default values 
    public RegisterClientController() 
    { 
        this.registerClientView = new RegisterClientView(this);
    
    } 
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    { 
 
    } 
} 
  
// Driver Code - main method to unable seeing the page individually
class RegistrationClient { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registerClientController = new RegisterClientController(); 
    } 
} 
