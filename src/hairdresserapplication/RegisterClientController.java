/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Kelly
 */

public class RegisterClientController extends JFrame implements ActionListener { 
  
    RegisterClientView registerClientView;
    private JButton RegisterButton;;
   
    // constructor, to initialize the components 
    // with default values 
    public RegisterClientController() 
    { 
        this.registerClientView = new RegisterClientView(this);
      
    
    } 
  
//    // method actionPerformed() 
//    // to get the action performed 
//    // by the user and act accordingly 

    @Override
    public void actionPerformed(ActionEvent e) {
          
        String FirstName = registerClientView.First_name();
        String LastName = registerClientView.last_Name();
        String IdEmail = registerClientView.email_id();
        String PhoneNumber = registerClientView.mobile_phone();
        int phoneNun = PhoneNumber.length();
        String getPassword = registerClientView.password_user();
         
            if (phoneNun != 10) {
                    JOptionPane.showMessageDialog(RegisterButton, "Enter a valid mobile number");
                }
        
             try {
            String dbServer = "jdbc:mysql://apontejaj.com:3306/Ingrid_2019411?useSSL=false";
            String user = "Ingrid_2019411";
            String password = "2019411";             
            
                    String query = "INSERT INTO registrationClient values('" + FirstName + "','" + LastName + "','"  +
                        getPassword + "','" + PhoneNumber + "')";
                    
                     Connection conn = DriverManager.getConnection(dbServer, user, password);
                     
                     // Get a statement from the connection
                     Statement stmt = conn.createStatement();
                     
                     

                    Statement sta = conn.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(RegisterButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(RegisterButton,
                            "Welcome! Your account is sucessfully created");
                    }
                    conn.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
    }

  
// Driver Code - main method to unable seeing the page individually
class RegistrationClient { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registerClientController = new RegisterClientController(); 
    } 
} 
