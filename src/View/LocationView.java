/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.LocationController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author 35389
 */
public class LocationView extends JFrame implements ActionListener{
          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
          private JLabel cName;
          private JTextField customerName;
          private JTextArea writeReview;
          private JLabel result;
          
          
          LocationController locationController;
    public LocationView(LocationController controller){
        
            locationController = controller;
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
    

    JButton reviewButton = new JButton("   Review    ");
    reviewButton.addActionListener(locationController);
    reviewButton.setBackground(Color.gray);
    reviewButton.setForeground(Color.PINK);
    
    leftHeader.add(reviewButton);
    
    JButton locationButton = new JButton("    Location    ");
    locationButton.addActionListener(locationController); // verify that later
    locationButton.setBackground(Color.gray);
    locationButton.setForeground(Color.PINK);
    
    
    leftHeader.add(locationButton);
    
    JButton homePage = new JButton("   Home    ");
    homePage.setBackground(Color.gray);
    homePage.setForeground(Color.PINK);
    homePage.addActionListener(locationController);
    
    
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
    JButton LoginHairdresser = new JButton("Hairdresser Login");
    JButton LoginClient = new JButton("Client Login");
    rightHeader.add(register);
    rightHeader.add(LoginHairdresser); 
    rightHeader.add(LoginClient); 
    
    LoginHairdresser.setBackground(Color.GRAY);
    LoginHairdresser.setForeground(Color.pink);
    LoginClient.setBackground(Color.GRAY);
    LoginClient.setForeground(Color.pink);
    register.setBackground(Color.GRAY);
    register.setForeground(Color.pink);
    
    //add button login
    LoginHairdresser.setActionCommand("loginHairdresser");
    LoginClient.setActionCommand("loginClient");
    register.setActionCommand("register");
    
    LoginHairdresser.addActionListener(locationController);
    LoginClient.addActionListener(locationController);
    register.addActionListener(locationController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
            
            //main
             JPanel mainLocation = new JPanel();
            mainLocation.setBackground(Color.PINK);
            
            this.add(mainLocation, BorderLayout.CENTER);
            mainLocation.setLayout(null);
            
         
            //add a grid
            GridLayout LocationLayout = new GridLayout(2,2); 
            mainLocation.setLayout(LocationLayout);
            
            JPanel leftLocation = new JPanel(); 
            FlowLayout locationLayout = new FlowLayout();
            leftLocation.setLayout(locationLayout);
            locationLayout.setAlignment(FlowLayout.LEFT);
            leftLocation.setBackground(Color.BLACK);
            
            JLabel photo1 = new JLabel();
            photo1.setIcon(new ImageIcon("image/mapLocationOne.png"));
            photo1.setSize(new Dimension(50,50));
            leftLocation.add(photo1);
            
            JLabel photo2 = new JLabel();
            photo2.setIcon(new ImageIcon("image/mapLocationOne.png"));
            photo2.setSize(new Dimension(50,50));
            leftLocation.add(photo2);
            
            
            mainLocation.add(leftLocation);
            
            // FOOTER
    
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
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops running when the window is closed 
        
        setVisible(true);
        }
        
         private void attributesSetter(){
        this.setVisible(true);
        this.setSize(600,700);
        this.setTitle("Amil's hair - Registration");
        setResizable(false); 
        }
         
           private void validation(){
            validate();
            repaint();
           }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Test4 {
    public static void main(String[] args) throws Exception {
       LocationController c = new LocationController();
    }
}
