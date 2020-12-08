/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Kelly
 */
public class RegisterClientView extends JFrame{
    
    // Components of the RegisterClientController form 
    private JPanel RegisterPanel; 
    private JLabel title; 
    private JLabel FirstName; 
    private JTextField TextFieldFirstName; 
    private JLabel LastName;
    private JTextField TextFieldLastName; 
    private JLabel email; 
    private JTextField TextFieldEmail; 
    private JLabel phone; 
    private JTextField TextFieldPhoneNumber; 
//    private JLabel location; 
//    private JRadioButton location1; 
//    private JRadioButton location2; 
    private ButtonGroup loc; 
    private JLabel password; 
    private JTextField tpassword; 
    private JLabel confpassword; 
    private JTextField tconfpassword; 
    
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox tickconfirm; 
    private JButton RegisterButton; 
    private JButton CancelButton;  
  
    RegisterClientController registerClientController;
    public RegisterClientView(RegisterClientController controller)
    {
        registerClientController = controller;
        attributesSetter();
        components();
        validation();
    }
    
     private void components(){
         JPanel header = new JPanel(); // creating header
    
    // adding a grid to the header (1 row and 3 columns)
    GridLayout headerLayout = new GridLayout(1,3); 
    header.setLayout(headerLayout);
    header.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
   
    //add the panel to the frame
    this.add(header, BorderLayout.PAGE_START);
    
       //organizing left hand side
    JPanel leftHeader = new JPanel(); 
    FlowLayout leftLayout = new FlowLayout();
    leftHeader.setLayout(leftLayout);
    leftLayout.setAlignment(FlowLayout.LEFT);
    leftHeader.setBackground(Color.BLACK);
    
    //add drowndrop list    
    String[] menuApp = { "Home", "Location", "Review" };
    JComboBox menuList = new JComboBox(menuApp);
    menuList.setSelectedIndex(2);
    menuList.addActionListener(registerClientController);
    menuList.setActionCommand("menuList");
    menuList.setBackground(Color.GRAY);
    menuList.setForeground(Color.PINK);
    
    leftHeader.add(menuList);
    
    // ADDING IT TO THE TOP SECTION the leftHeader to header Panel
    header.add(leftHeader);
      
    // organizing the center hand side
    JPanel centreHeader = new JPanel();
    FlowLayout centreLayout = new FlowLayout();
    centreHeader.setLayout(centreLayout);
    centreLayout.setAlignment(FlowLayout.CENTER);
    centreHeader.setBackground(Color.BLACK);
   
    //set the logo on the centreHeader panel
    JLabel logo = new JLabel();
    logo.setIcon(new ImageIcon("image/logo.png"));
    //centreHeader add logo
    centreHeader.add(logo);
    
    //adding to the header
    header.add(centreHeader);
    
    //organizing the right hand side
    JPanel rightHeader = new JPanel();
    FlowLayout rightLayout = new FlowLayout();
    rightHeader.setLayout(rightLayout);
    rightLayout.setAlignment(FlowLayout.RIGHT);
    rightHeader.setBackground(Color.BLACK);
    
    //add button register and login
    JButton register = new JButton("Register");
    JButton login = new JButton("Login");
    rightHeader.add(register);
    rightHeader.add(login); 
    
    login.setBackground(Color.GRAY);
    login.setForeground(Color.pink);
    register.setBackground(Color.GRAY);
    register.setForeground(Color.pink);
    
    
    login.setActionCommand("login");
    register.setActionCommand("register");
    
    login.addActionListener(registerClientController);
    register.addActionListener(registerClientController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
    
    //ends header****************************888
        
    //starts main register page
        JPanel rp = new JPanel(); // creating the main panel
        rp.setBackground(Color.PINK);

        //adding the panel to the frame
        this.add(rp, BorderLayout.CENTER);
        rp.setLayout(null); 
  
        title = new JLabel("Registration"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 40); 
        title.setLocation(220, 30); 
        rp.add(title); 
        
//        location = new JLabel("Location"); 
//        location.setFont(new Font("Arial", Font.PLAIN, 20)); 
//        location.setSize(100, 20); 
//        location.setLocation(100, 100); 
//        rp.add(location); 
//        
//        location1 = new JRadioButton("FoxRock"); 
//        location1.setFont(new Font("Arial", Font.PLAIN, 15)); 
//        location1.setSelected(true); 
//        location1.setSize(90, 20); 
//        location1.setLocation(250, 100); 
//        location1.setBackground(Color.pink);
//        rp.add(location1); 
//  
//        location2 = new JRadioButton("Ballsbridge"); 
//        location2.setFont(new Font("Arial", Font.PLAIN, 15)); 
//        location2.setSelected(false); 
//        location2.setSize(100, 20); 
//        location2.setLocation(340, 100); 
//        location2.setBackground(Color.pink);
//        rp.add(location2); 
//  
//        loc = new ButtonGroup(); 
//        loc.add(location1); 
//        loc.add(location2); 
//  
        FirstName = new JLabel("First Name"); 
        FirstName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        FirstName.setSize(100, 20); 
        FirstName.setLocation(100, 125); 
        rp.add(FirstName); 
  
        TextFieldFirstName = new JTextField(); 
        TextFieldFirstName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        TextFieldFirstName.setSize(190, 20); 
        TextFieldFirstName.setLocation(250, 125); 
        rp.add(TextFieldFirstName); 
        
        LastName = new JLabel("Last Name"); 
        LastName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        LastName.setSize(100, 20); 
        LastName.setLocation(100, 150); 
        rp.add(LastName); 
  
        TextFieldLastName = new JTextField(); 
        TextFieldLastName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        TextFieldLastName.setSize(190, 20); 
        TextFieldLastName.setLocation(250, 150); 
        rp.add(TextFieldLastName); 
        
        email = new JLabel("Email address"); 
        email.setFont(new Font("Arial", Font.PLAIN, 18)); 
        email.setSize(150, 20); 
        email.setLocation(100, 175); 
        rp.add(email); 
  
        TextFieldEmail = new JTextField(); 
        TextFieldEmail.setFont(new Font("Arial", Font.PLAIN, 15)); 
        TextFieldEmail.setSize(190, 20); 
        TextFieldEmail.setLocation(250, 175); 
        rp.add(TextFieldEmail); 
  
        phone = new JLabel("Phone number"); 
        phone.setFont(new Font("Arial", Font.PLAIN, 18)); 
        phone.setSize(150, 20); 
        phone.setLocation(100, 200); 
        rp.add(phone); 
  
        TextFieldPhoneNumber = new JTextField(); 
        TextFieldPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 15)); 
        TextFieldPhoneNumber.setSize(190, 20); 
        TextFieldPhoneNumber.setLocation(250, 200); 
        rp.add(TextFieldPhoneNumber); 

        password = new JLabel("Create password"); 
        password.setFont(new Font("Arial", Font.PLAIN, 18)); 
        password.setSize(150, 20); 
        password.setLocation(100, 250); 
        rp.add(password); 
  
        tpassword = new JTextField(); 
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tpassword.setSize(190, 20); 
        tpassword.setLocation(250, 250); 
        rp.add(tpassword); 
        
        confpassword = new JLabel("Confirm password"); 
        confpassword.setFont(new Font("Arial", Font.PLAIN, 18)); 
        confpassword.setSize(150, 20); 
        confpassword.setLocation(100, 275); 
        rp.add(confpassword); 
  
        tconfpassword = new JTextField(); 
        tconfpassword.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tconfpassword.setSize(190, 20); 
        tconfpassword.setLocation(250, 275); 
        rp.add(tconfpassword); 
  
        RegisterButton = new JButton("Register"); 
        RegisterButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        RegisterButton.setSize(100, 20); 
        RegisterButton.setLocation(295, 320);  
        RegisterButton.addActionListener(registerClientController); 
        rp.add(RegisterButton); 
  
//        CancelButton = new JButton(""); 
//        CancelButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
//        CancelButton.setSize(100, 20); 
//        CancelButton.setLocation(280, 400); 
//        CancelButton.addActionListener(registerClientController); 
//        rp.add(CancelButton); 
  
        
        
        // FOOTER*********************************************
    
        JPanel footer = new JPanel(); // creating header
    
    
        GridLayout footerLayout = new GridLayout(1,3); // adding a grid to the header 1 row and 3 columns
        footer.setLayout(footerLayout);
        footer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        footer.setBackground(Color.BLACK);
        //add the panel to the frame
        this.add(footer, BorderLayout.PAGE_END);
               
        // organising left side
        JPanel leftFooter = new JPanel();
        FlowLayout footerLeft = new FlowLayout();
        leftFooter.setLayout(footerLeft);
        footerLeft.setAlignment(FlowLayout.LEFT);
        leftFooter.setBackground(Color.BLACK);
        
        JLabel leftCol = new JLabel("<html><b>Follow us:</b> <br> Facebook <br> Instagram <br> Twitter </html>");
        leftCol.setForeground(Color.PINK);
        leftFooter.add(leftCol);
        
        footer.add(leftFooter);
        
        // organising center side
        JPanel centerFooter = new JPanel();
        FlowLayout footerCenter = new FlowLayout();
        centerFooter.setLayout(footerCenter);
        footerCenter.setAlignment(FlowLayout.CENTER);
        centerFooter.setBackground(Color.BLACK);
        
        JLabel centerCol = new JLabel("<html><b>Contact Hairdresser:</b> <br> Brighton Rd, Foxrock, Dublin 18 <br> 083 001 1000 <br> foxrock@milhair.com </html>");
        centerCol.setForeground(Color.PINK);
        centerFooter.add(centerCol);
        
        footer.add(centerCol);
        
        //organising right side
        JPanel rightFooter = new JPanel();
        FlowLayout footerRight = new FlowLayout();
        rightFooter.setLayout(footerRight);
        footerRight.setAlignment(FlowLayout.RIGHT);
        rightFooter.setBackground(Color.BLACK);
        
        JLabel rightCol = new JLabel("<html> <br> Serpentine Ave, Ballsbridge, Dublin 4\n" +
                                        " <br> 083 001 1002\n" +
                                        " <br> ballsbridge@milhair.com </html>");
        rightCol.setForeground(Color.PINK);
        rightFooter.add(rightCol);
        
        footer.add(rightCol);
        
        
       
        JPanel footer2 = new JPanel(); // creating header
    
        //footer ends*************************
  
        setVisible(true); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops running when the window is closed 
     
     }
    
    // Setting attributes
    private void attributesSetter(){
        this.setVisible(true);
        this.setSize(600,700);
        this.setTitle("Amil's hair - Registration");
        setResizable(false); 
    }
    
     private void validation(){
        this.validate();
        this.repaint();
    }
    
}// Driver Code - main method to unable seeing the page individually
class RegistrationClient2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registerClientController = new RegisterClientController(); 
    } 
} 

