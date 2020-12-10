/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 35389
 */
public class LoginController extends JFrame implements ActionListener {
  
    LoginView loginView;
    LoginModel loginModel;
 //   Register register;
    
    // constructor, to initialize the components 
    // with default values 
    public LoginController(){
        this.loginView = new LoginView(this);
        this.loginModel = new LoginModel();
   //     this.register = new Register();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String un = loginView.getUser();
        String pw = loginView.getPassword();
        
        User user = new User(un, pw);
        
        boolean result = loginModel.login(user);
        
        String resultMessage = "try again";
        
        if(result){ // if result true give the message and we need to put to log into the page the person from that
            resultMessage = "welcome in";
            JOptionPane.showMessageDialog(loginView, resultMessage);
        }else {
          
            JOptionPane.showMessageDialog(loginView, resultMessage);
        }
    
    }
}
    
   

