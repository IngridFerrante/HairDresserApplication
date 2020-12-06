/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Kelly
 */
  
public class RegisterHairDresserController extends JFrame implements ActionListener { 
  
    RegisterHairDresserView registerHairDresserView;
    // constructor, to initialize the components 
    // with default values 
    public RegisterHairDresserController() 
    { 
        this.registerHairDresserView = new RegisterHairDresserView(this);
    
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    { 
//        if (e.getSource() == regbt) { 
//            if (tickconfirm.isSelected()) { 
//                String data1; 
////                String data 
////                    = 
////                        "First Name : "
////                      + tname.getText() + "\n"
////                      + "Last Name : "
////                      + tsurname.getText() + "\n"
////                      + "Email address : "
////                      + temail.getText() + "\n"   
////                      + "Phone Number : "
////                      + tphone.getText() + "\n"; 
//                
//                if (location1.isSelected()) 
//                    data1 = "Location : FoxRock"
//                            + "\n"; 
//                else
//                    data1 = "Location : Ballsbridge"
//                            + "\n"; 
//
////                tout.setText(data + data1); 
//                //tout.setEditable(false); 
//                res.setText("Registration successfully!!"); 
//            } 
//            else { 
//                //tout.setText(""); 
//                resadd.setText(""); 
//                res.setText("Please confirm box"); 
//            } 
//        } 
//  
//        else if (e.getSource() == reset) { 
//            String def = ""; 
//            tname.setText(def); 
//            tadd.setText(def);
//            surname.setText(def); 
//            tadd.setText(def);
//            temail.setText(def); 
//            res.setText(def);
//            tphone.setText(def); 
//            //res.setText(def); 
//            //tout.setText(def); 
//            tickconfirm.setSelected(false); 
//            //resadd.setText(def); 
//        } 
    } 
} 
  
// Driver Code 
class Registration { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterHairDresserController registerController = new RegisterHairDresserController(); 
    } 
} 