/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.RegisterClientController;
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
 * @author 35389
 */
public class RegisterClientView extends JFrame{
    
    // Components of the RegisterHairDresserController form 
    private JPanel RegisterPanel; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel LastName;
    private JTextField txtLastName; 
    private JLabel email; 
    private JTextField temail; 
    private JLabel phone; 
    private JTextField tphone; 

    private JLabel password; 
    private JTextField tpassword; 
    private JLabel confpassword; 
    private JTextField tconfpassword;   
    private JButton RegisterButton; 
    private JLabel result;

    
    RegisterClientController registerController;
    public RegisterClientView(RegisterClientController controller)
    {
        registerController = controller;
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
    
        //add button
    JButton reviewButton = new JButton("   Review    ");
    reviewButton.addActionListener(registerController);
    reviewButton.setBackground(Color.gray);
    reviewButton.setForeground(Color.PINK);
    
    leftHeader.add(reviewButton);
    
    //add button
    JButton locationButton = new JButton("    Location    ");
    locationButton.addActionListener(registerController); // verify that later
    locationButton.setBackground(Color.gray);
    locationButton.setForeground(Color.PINK);
    
    
    leftHeader.add(locationButton);
        //add button
    JButton homePage = new JButton("   Home    ");
    homePage.setBackground(Color.gray);
    homePage.setForeground(Color.PINK);
    homePage.addActionListener(registerController);
    
    
    leftHeader.add(homePage);
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
    
    login.addActionListener(registerController);
    register.addActionListener(registerController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
    
    //ends header****************************
        
    //starts main register page
        JPanel rp = new JPanel(); // creating the main panel
        rp.setBackground(Color.PINK);

        //adding the panel to the frame
        this.add(rp, BorderLayout.CENTER);
        rp.setLayout(null); 
  
        //titles and texfield to put the requirement below: 
        title = new JLabel("Registration"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 40); 
        title.setLocation(220, 30); 
        rp.add(title); 
        
        name = new JLabel("First Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 18)); 
        name.setSize(100, 20); 
        name.setLocation(100, 125); 
        rp.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(250, 125); 
        rp.add(tname); 
        
        LastName = new JLabel("Last Name"); 
        LastName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        LastName.setSize(100, 20); 
        LastName.setLocation(100, 150); 
        rp.add(LastName); 
  
        txtLastName = new JTextField(); 
        txtLastName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        txtLastName.setSize(190, 20); 
        txtLastName.setLocation(250, 150); 
        rp.add(txtLastName); 
        
        email = new JLabel("Email address"); 
        email.setFont(new Font("Arial", Font.PLAIN, 18)); 
        email.setSize(150, 20); 
        email.setLocation(100, 175); 
        rp.add(email); 
  
        temail = new JTextField(); 
        temail.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temail.setSize(190, 20); 
        temail.setLocation(250, 175); 
        rp.add(temail); 
  
        phone = new JLabel("Phone number"); 
        phone.setFont(new Font("Arial", Font.PLAIN, 18)); 
        phone.setSize(150, 20); 
        phone.setLocation(100, 200); 
        rp.add(phone); 
  
        tphone = new JTextField(); 
        tphone.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tphone.setSize(190, 20); 
        tphone.setLocation(250, 200); 
        rp.add(tphone); 

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
        RegisterButton.addActionListener(registerController); 
        rp.add(RegisterButton); 
            
        result = new JLabel(""); 
        result.setFont(new Font("Arial", Font.PLAIN, 12)); 
        result.setSize(500, 20); 
        result.setLocation(10, 360); 
        rp.add(result); 
        

        // FOOTER starts*********************************************   
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
     
     //getters
    public String getFirstName(){
        return tname.getText();
    }
    public String getLastName(){
        return txtLastName.getText();
    }
    public String getEmail(){
        return temail.getText();
    }
    public String getPhone(){
        return tphone.getText();
    }
    public String getPassword(){
        return tpassword.getText();
    }
    public String getConfPassword(){
        return tconfpassword.getText();
    }
    
    public void setResult(String message)
    {
        //set the result message
        result.setText(message);
        
        tname.setText("");
        txtLastName.setText("");
        temail.setText("");
        tphone.setText("");
        tpassword.setText("");
        tconfpassword.setText("");
    }
    
    public void setBadInput(String message)
    {
        result.setText(message);
        tpassword.setText("");
        tconfpassword.setText("");
    }
} 
     // Driver Code - main method to unable seeing the page individually
class RegistrationClient2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        RegisterClientController registerClientController = new RegisterClientController(); 
    } 
} 

