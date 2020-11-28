/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 35389
 */
public class Controller implements ActionListener {
    Login view;
    Model model;
    Register register;
    
    public Controller(){
        this.view = new Login(this);
        this.model = new Model();
        this.register = new Register();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String un = view.getUser();
        String pw = view.getPassword();
        
        User user = new User(un, pw);
        
        boolean result = model.login(user);
        
        String resultMessage = "try again";
        
        if(result){ // if result true give the message and we need to put to log into the page the person from that
            resultMessage = "welcome in";
            JOptionPane.showMessageDialog(view, resultMessage);
        }else {
          
            JOptionPane.showMessageDialog(view, resultMessage);
            
            
        }
        
        
        
        
    }
    
}