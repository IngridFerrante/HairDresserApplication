/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.HairDresserApplicationController;
import Controller.LocationController;
import controller.LoginController;
import controller.LoginClientController;
import controller.RegisterClientController;
import controller.RegisterHairDresserController;
import controller.ReviewPageController;
//import hairdresserapplication.HairDresserApplication;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author 35389
 */
public class HairDresserApplicationView extends JFrame {

    JComboBox menuList = null; 
    
    HairDresserApplicationController hairDresserApplicationController;
    
    public HairDresserApplicationView(HairDresserApplicationController controller)
    {
        hairDresserApplicationController = controller;
        attributesSetter();
        components();
        validation();
    }
    
     private void components(){
         // header
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
    
    //add buttons
    
    JButton reviewButton = new JButton("   Review    ");
    reviewButton.addActionListener(hairDresserApplicationController);
    reviewButton.setBackground(Color.gray);
    reviewButton.setForeground(Color.PINK);
    
    leftHeader.add(reviewButton);
    
    JButton locationButton = new JButton("    Location    ");
    locationButton.addActionListener(hairDresserApplicationController); // verify that later
    locationButton.setBackground(Color.gray);
    locationButton.setForeground(Color.PINK);
    
    
    leftHeader.add(locationButton);
    
    JButton homePage = new JButton("   Home    ");
    homePage.setBackground(Color.gray);
    homePage.setForeground(Color.PINK);
    homePage.addActionListener(hairDresserApplicationController);
    
    
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
    
    //add button register and loginHairdresser
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
    
    
    LoginHairdresser.setActionCommand("loginHairdresser");
    LoginClient.setActionCommand("loginClient");
    register.setActionCommand("register");
    
    LoginHairdresser.addActionListener(hairDresserApplicationController);
    LoginClient.addActionListener(hairDresserApplicationController);
    register.addActionListener(hairDresserApplicationController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
    
    //ends header********************************************
    
    // Main Area setup from here
    JPanel mainArea = new JPanel(); // creating the main panel
    BorderLayout mainLayout = new BorderLayout();
    mainArea.setLayout(mainLayout);
    this.add(mainArea, BorderLayout.CENTER); // adding mainArea to the frame
    
    //create a main panel to hold panels
    JPanel mainArea2 = new JPanel();
    GridLayout mainBorder = new GridLayout(1,1);
    mainArea2.setLayout(mainBorder);
    // insert a border around the main panel and the border size
    mainArea2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    
        // ORGANISING RIGHT HAND SIDE -- 
        JPanel backMainPanel = new JPanel();
        mainArea2.add(backMainPanel);
        backMainPanel.setBackground(Color.ORANGE);//just in case to see if is all good
        
        // DEVIDING MINI RIGHT SECCTION INTO TWO (TWO ROWS - ONE COLUMN)
        GridLayout miniMainRightLayout = new GridLayout(2,1); //check this bit
        backMainPanel.setLayout(miniMainRightLayout);
        
        // ORGANISING THE UPPER PART
        JPanel topPart = new JPanel();
        backMainPanel.add(topPart);
        // insert a border around the leftHeader panel and the border size
        topPart.setBorder(BorderFactory.createLineBorder(Color.pink, 5));
        topPart.setBackground(Color.pink);
//        JLabel p3 = new JLabel("photo and promotion");
//        topPart.add(p3);
        
        // ORGANISING THE LOWER PART
        JPanel bottonPart = new JPanel();
        backMainPanel.add(bottonPart);
        // insert a border around the leftHeader panel and the border size
        bottonPart.setBackground(Color.GRAY);
        bottonPart.setBorder(BorderFactory.createLineBorder(Color.gray, 32));
        
        
        JPanel p4 = new JPanel();
        JLabel txtp4 = new JLabel("<html>Cut: <br> 90Euro</html>");
        p4.add(txtp4);
        txtp4.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20));
        p4.setBackground(Color.white);
        p4.setPreferredSize(new Dimension(100, 130));//set Panel size
        p4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        
        JPanel p5 = new JPanel();
        JLabel txtp5 = new JLabel("<html>BlowDry: <br> 70Euro</html>");
        p5.add(txtp5);
        txtp5.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20));
        p5.setPreferredSize(new Dimension(100, 130));//setPanel size
        p5.setBackground(Color.white);
        p5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        JPanel p6 = new JPanel();
        JLabel txtp6 = new JLabel("<html>Colour: <br> 150Euro</html>");
        p6.add(txtp6);
        txtp6.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20));
        p6.setPreferredSize(new Dimension(100, 130));//setPanel size
        p6.setBackground(Color.white);
        p6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        JPanel p7 = new JPanel();
        JLabel txtp7 = new JLabel("<html>Styling: <br> 120Euro</html>");
        p7.add(txtp7);
        txtp7.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20));
        p7.setPreferredSize(new Dimension(100, 130));//setPanel size
        p7.setBackground(Color.white);
        p7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        bottonPart.add(p4);
        bottonPart.add(p5);
        bottonPart.add(p6);
        bottonPart.add(p7);
        
        mainArea.add(mainArea2, BorderLayout.CENTER);
       
        //this set close/stop the program copletetly once you close the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    // organising the left side
    JPanel leftMain = new JPanel();
    topPart.add(leftMain);
    leftMain.setBackground(Color.PINK);
    
    //set photo into panel
    JLabel photo = new JLabel();
    photo.setIcon(new ImageIcon("image/photo.png"));
    
    leftMain.add(photo);
 
    // organising the right side
    JPanel rightMain = new JPanel();
    topPart.add(rightMain);
    rightMain.setBackground(Color.PINK);
    
    JLabel promotion = new JLabel("<html> Opening Hours: <br> Monday: Closed  <br> Tuesday: 10:00 to 18:00  <br> Wednesday: 10:00 to 18:00  <br> Thursday: 10:00 to 18:00  <br> Friday: 10:00 to 18:00  <br> Saturday: 10:00 to 18:00  <br> Sunday: Closed </html>");
    rightMain.add(promotion);
    

        

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
        

        JPanel footer2 = new JPanel(); // ends footer
     }
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
         
         public String getLocationSalon(){
            return (String) menuList.getSelectedItem();
        }  
         
 
}

         
     class mainPage { 
  
    public static void main(String[] args) throws Exception { 
        HairDresserApplicationController review = new HairDresserApplicationController(); 
    } 
}
