/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.LoginClientModel;
import View.LoginClientView;
import model.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Kelly
 */
public class LoginClientController extends JFrame implements ActionListener {
  
    LoginClientView loginCView;
    LoginClientModel loginCModel;
 //   Register register;
    
    // constructor, to initialize the components 
    // with default values 
    public LoginClientController(){
        this.loginCView = new LoginClientView(this);
        this.loginCModel = new LoginClientModel();
   //     this.register = new Register();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String un = loginCView.getUser();
        String pw = loginCView.getPassword();
        
        User user = new User(un, pw);
        
        boolean result = loginCModel.login(user);
        
        String resultMessage = "try again";
        
        if(result){ // if result true give the message and we need to put to log into the page the person from that
            resultMessage = "welcome in";
            JOptionPane.showMessageDialog(loginCView, resultMessage);
            new controller.CheckOrMakeBookController();
        }else {
          
            JOptionPane.showMessageDialog(loginCView, resultMessage);
        }
    
    }
}
//// Driver Code -- methos to acces the page
class LoginUser { 
  
    public static void main(String[] args) throws Exception 
    { 
        LoginClientController lg = new LoginClientController(); 
       
    } 
} 