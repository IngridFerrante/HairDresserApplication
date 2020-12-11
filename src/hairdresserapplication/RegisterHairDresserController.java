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
  
public class RegisterHairDresserController extends JFrame implements ActionListener { 
  
    RegisterHairDresserView registerHairDresserView;
    RegisterHairDresserModel registerHairDresserModel;
    // constructor, to initialize the components 
    // with default values 
    public RegisterHairDresserController() 
    { 
        this.registerHairDresserView = new RegisterHairDresserView(this);
        this.registerHairDresserModel = new RegisterHairDresserModel();
    
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
     //   to identify different text field
        if(e.getActionCommand().equals("login")){  
            new LoginController();
        
        }
        else if(e.getActionCommand().equals("Register")){
            String location = registerHairDresserView.getLocationSalon();
            String firstName = registerHairDresserView.getFirstName();
            String lastName = registerHairDresserView.getLastName();
            String email = registerHairDresserView.getEmail();
            String phoneNr = registerHairDresserView.getPhone();
            String password = registerHairDresserView.getPassword();
            
            User newUser = new User(location, firstName, lastName,email, phoneNr, password);
            
            boolean result = registerHairDresserModel.registerHairDresser(newUser);
            
            
            if(result == true)
            {
                registerHairDresserView.setResult("Welcome " + firstName + ". You registersted successfully. You can login");
                new LoginController();
            }
        }
    }
} 
  
// Driver Code - main method to unable seeing the page individually
class Registration { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterHairDresserController registerController = new RegisterHairDresserController(); 
    } 
}