/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.LoginController;
import view.RegisterHairDresserView;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import model.RegisterHairDresserModel;
import model.User;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Kelly
 */
  
public class RegisterHairDresserController extends JFrame implements ActionListener { 
  
    RegisterHairDresserView registerHairDresserView;
    RegisterHairDresserModel registerHairDresserModel;

    
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
     //   getting aCTIONS command  to the buttons
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
            String confPassword = registerHairDresserView.getConfPassword();
            
            User newUser = new User(location, firstName, lastName,email, phoneNr, password, confPassword );
            
            if(newUser.isValid())
            {
                boolean result = registerHairDresserModel.registerHairDresser(newUser);

                if(result == true)
                {
                    registerHairDresserView.setResult("Welcome " + firstName + ". You registersted successfully. You can login");
                    new LoginController();
                }
            }
            else
            {
                registerHairDresserView.setBadInput("Fields cannot be empty. The password must be less than 20 and must match.");
            }
        }else if(e.getActionCommand().equals("   Review    ")){  
            new Controller.ReviewReadController();
            
    } else if(e.getActionCommand().equals("    Location    ")){  
            new Controller.LocationController();
            
    }else if(e.getActionCommand().equals("   Home    ")){  
            new Controller.HairDresserApplicationController();
            
    }
    }
} 
  
//  // method to test the page individuality
class Registration { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterHairDresserController registerController = new RegisterHairDresserController(); 
    } 
}