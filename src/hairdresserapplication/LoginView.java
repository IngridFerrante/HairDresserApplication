/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 35389
 */

public class LoginView extends JFrame{
    
     // Components of the LoginView form 
    private JLabel UserName;
    private JTextField txt1;
    private JTextField txt2;
    LoginController controller;
    
    public LoginView (LoginController controller)
    {
        this.controller = controller;       
        // We encapsulated the building process of the w indow
        atributesSetter();
        components();
        validation();
    }

    private void atributesSetter() {
            this.setVisible(true);
            this.setSize(300,200);
            this.setTitle("Amil's hair - Login");
    }
    
    //organising components

    private void components() {
        JPanel p = new JPanel();
        this.add(p);
        p.setBackground(Color.PINK);
        
        JLabel userName = new JLabel("Name: ");
       // UserName.setSize(100, 20);
       //configure position
        p.add(userName);
        
        txt1 = new JTextField(10);
        p.add(txt1);
      
        JLabel userPassword = new JLabel("Password: ");
        p.add(userPassword);
        
        txt2 = new JTextField(10);        
        p.add(txt2);
        
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(controller);
        p.add(loginButton);
             
    }
    
    // validation and repainting 
    private void validation() {
        this.validate();
        this.repaint();
    }
    
    //get username and password
    public String getUser(){
        return txt1.getText();
    }
    
    public String getPassword(){
        return txt2.getText();
    }   
}


//// Driver Code 
//class LoginUser { 
//  
//    public static void main(String[] args) throws Exception 
//    { 
//        LoginView lg = new LoginView(); 
//       
//    } 
//} 
