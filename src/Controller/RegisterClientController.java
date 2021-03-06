/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.LoginController;
import controller.LoginClientController;

import view.RegisterClientView;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import model.RegisterClientModel;
import model.User;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Kelly
 */

public class RegisterClientController extends JFrame implements ActionListener { 
  
    RegisterClientView registerClientView;
    RegisterClientModel registerClientModel;
   
    
    public RegisterClientController() 
    { 
        this.registerClientView = new RegisterClientView(this);
        this.registerClientModel = new RegisterClientModel();
    
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
            String firstName = registerClientView.getFirstName();
            String lastName = registerClientView.getLastName();
            String email = registerClientView.getEmail();
            String phoneNr = registerClientView.getPhone();
            String password = registerClientView.getPassword();
            String confPassword = registerClientView.getConfPassword();
            
            User newUser = new User(firstName, lastName,email, phoneNr, password, confPassword);
            
            if(newUser.isValid())
            {
                boolean result = registerClientModel.registerClient(newUser);
                if(result == true)
                {
                    registerClientView.setResult("Welcome " + firstName + ". You registersted successfully. Now just login using you EMAIL and PASSWORD.");
                    new LoginClientController();
                }
            }
            else
            {
                registerClientView.setBadInput("Empty fields not allowed. The password must be less than 20 and must match.");
            }
        }else if(e.getActionCommand().equals("Review")){  
            new Controller.ReviewReadController();
        }    
        else if(e.getActionCommand().equals("Location")){  
            new Controller.LocationController();
        }
    }
} 

  
//// method to test the page individuality
class RegistrationClient { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registerClientController = new RegisterClientController(); 
    } 
} 
