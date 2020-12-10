/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
    private JLabel title;
    private JLabel UserName;
    private JTextField UserTxt;
    private JLabel UserPassword;
    private JTextField PasswordTxt;
    private JButton loginButton;
    
    LoginController logincontroller;   
    public LoginView (LoginController controller)
    {
        logincontroller = controller;       
        // We encapsulated the building process of the w indow
        atributesSetter();
        components();
        validation();
    }

    private void atributesSetter() {
            this.setVisible(true);
            this.setSize(300,250);
            this.setTitle("Amil's hair - Login");
    }
    
    //organising components

    private void components() {
        JPanel p = new JPanel();
        this.add(p, BorderLayout.CENTER);
        p.setLayout(null); //holds the location inside the panel
        p.setBackground(Color.PINK);
        
        title = new JLabel("Login"); 
        title.setFont(new Font("Arial", Font.PLAIN, 18)); 
        title.setSize(150, 20); 
        title.setLocation(120, 18); 
        p.add(title); 
        
        UserName = new JLabel("Name: ");
        UserName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        UserName.setSize(100, 20);
        UserName.setLocation(20, 60); //configure position
        p.add(UserName);
        
        UserTxt = new JTextField("your email address",10);
        UserTxt.setFont(new Font("Arial", Font.PLAIN, 15)); 
        UserTxt.setSize(190, 20);
        UserTxt.setLocation(70, 60); //configure position
        p.add(UserTxt);

        UserPassword = new JLabel("Password: ");
        UserPassword.setFont(new Font("Arial", Font.PLAIN, 15)); 
        UserPassword.setSize(100, 20);
        UserPassword.setLocation(20, 100); //configure position
        p.add(UserPassword);
        
        PasswordTxt = new JTextField(10); 
        PasswordTxt.setSize(170, 20);
        PasswordTxt.setLocation(90, 100); //configure position
        p.add(PasswordTxt);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(logincontroller);
        loginButton.setSize(70, 20);
        loginButton.setLocation(110, 160); //configure position
        p.add(loginButton);
             
    }
    
    // validation and repainting 
    private void validation() {
        this.validate();
        this.repaint();
    }
    
    //get username and password
    public String getUser(){
        return UserTxt.getText();
    }
    
    public String getPassword(){
        return PasswordTxt.getText();
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
