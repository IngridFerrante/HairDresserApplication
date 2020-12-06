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

public class Login extends JFrame{
    
    private JTextField txt1;
    private JTextField txt2;
    Controller controller;
    
    public Login (Controller controller)
    {
        this.controller = controller;
        
        // We encapsulated the building process of the window
        atributesSetter();
        components();
        validation();
    }

    private void atributesSetter() {
            this.setVisible(true);
            this.setSize(600,700);
            this.setTitle("Amil's hair");
    }
    
    //organising components

    private void components() {
        JPanel p = new JPanel();
        this.add(p);
        p.setBackground(Color.PINK);
        
        

        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(controller);
      
        JLabel userName = new JLabel("Name: ");
        JLabel userPassword = new JLabel("Password: ");
        
        
        p.add(userName);
        p.add(txt1);
        p.add(userPassword);
        p.add(txt2);
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
