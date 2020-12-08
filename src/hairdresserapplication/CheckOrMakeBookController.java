/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class CheckOrMakeBookController extends JFrame implements ActionListener { 
  
    CheckOrMakeBookView checkOrMakeBookView;
    // constructor, to initialize the components 
    // with default values 
    public CheckOrMakeBookController() 
    { 
        this.checkOrMakeBookView = new CheckOrMakeBookView (this);
    
    } 
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    {
//     //   to identify different text field
//        if(e.getActionCommand().equals("login")){  
//            new LoginController();
//        
//    }
//        else if(e.getActionCommand().equals("register")){
//            
//            ImageIcon icon = new ImageIcon("image/logo.png");
//            
//            Object[] registerChoice = {"Hairdresser", "Client"};
//                Object defaultChoice = registerChoice[0];
//                int optionChoosen = JOptionPane.showOptionDialog(this,
//             "Who are you ?",
//             "Register",
//             JOptionPane.YES_NO_OPTION,
//             JOptionPane.QUESTION_MESSAGE,
//             icon,
//             registerChoice,
//             defaultChoice);
//                
//            if (optionChoosen == 0){
//                 new RegisterHairDresserController(); // put the page of hairdresser register here
//            }else{
//                    new RegisterClientController(); // call register client page
//               
//            }       
//    }
  
      // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
} 
  
// Driver Code - main method to unable seeing the page individually
class CheckOrBookClient { 
  
    public static void main(String[] args) throws Exception 
    { 
        CheckOrMakeBookController checkorbookController = new CheckOrMakeBookController(); 
    } 
}
