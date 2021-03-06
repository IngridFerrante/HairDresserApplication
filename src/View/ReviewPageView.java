/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ReviewPageController;
import controller.CheckOrMakeBookController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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
public class ReviewPageView extends JFrame implements ActionListener {
    //components ReviewPageView 
          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
          private JLabel cName;
          private JTextField customerName;
          private JTextArea writeReview;
          
          private JLabel result;
          
          
    ReviewPageController reviewPageController;
   
    public ReviewPageView(ReviewPageController controller)
    {
        reviewPageController = controller;
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
    
    // adding button to the header left side
    JButton reviewButton = new JButton("   Review    ");
    reviewButton.addActionListener(reviewPageController);
    reviewButton.setBackground(Color.gray);
    reviewButton.setForeground(Color.PINK);
    
    leftHeader.add(reviewButton);
    
    JButton locationButton = new JButton("    Location    ");
    locationButton.addActionListener(reviewPageController); // verify that later
    locationButton.setBackground(Color.gray);
    locationButton.setForeground(Color.PINK);
    
    
    leftHeader.add(locationButton);
    
    JButton homePage = new JButton("   Home    ");
    homePage.setBackground(Color.gray);
    homePage.setForeground(Color.PINK);
    homePage.addActionListener(reviewPageController);
    
    
    leftHeader.add(homePage);
    
    
    leftHeader.add(locationButton);
     
    
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
    
    //add button login
    LoginHairdresser.setActionCommand("loginHairdresser");
    LoginClient.setActionCommand("loginClient");
    register.setActionCommand("register");
    
    LoginHairdresser.addActionListener(reviewPageController);
    LoginClient.addActionListener(reviewPageController);
    register.addActionListener(reviewPageController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
    
    // creating the main panel 
            JPanel mainReview = new JPanel();
            mainReview.setBackground(Color.PINK);
            
            this.add(mainReview, BorderLayout.CENTER);
            mainReview.setLayout(null);
            
            //add title
            JLabel reviewTitle = new JLabel("How was the service ? "); 
            reviewTitle.setFont(new Font("Arial", Font.PLAIN, 25)); 
            reviewTitle.setSize(300, 25); 
            reviewTitle.setLocation(150, 20);
            mainReview.add(reviewTitle);
            
            //neme title
            JLabel cName = new JLabel("Name: ");
            cName.setFont(new Font("Arial", Font.PLAIN, 18)); 
            cName.setSize(300, 30);
            cName.setLocation(150, 60);
            mainReview.add(cName);
            
            //textfield to put the name
           customerName = new JTextField();
           customerName.setSize(300, 30);
           customerName.setLocation(150, 85);
           customerName.setBackground(Color.GRAY);
           customerName.setForeground(Color.white);
           mainReview.add(customerName);
           
           //textArea to write a review
            writeReview = new JTextArea("My experience: ", 50, 50);
            writeReview.setSize(300, 200); 
            writeReview.setLocation(150, 140);
            writeReview.setBackground(Color.GRAY);
            writeReview.setForeground(Color.white);
            
            mainReview.add(writeReview);
            
            JButton sendReview = new JButton("Submit"); 
            sendReview.setSize(150, 40);
            sendReview.setLocation(300, 350);
            sendReview.setBackground(Color.blue);
            sendReview.setForeground(Color.white);
            sendReview.addActionListener(reviewPageController);
            mainReview.add(sendReview);
            
            result = new JLabel(""); 
            result.setFont(new Font("Arial", Font.PLAIN, 12)); 
            result.setSize(500, 20); 
            result.setLocation(10, 360); 
            mainReview.add(result);
            
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
        this.validate();
        this.repaint();
        }
         
         public String getCustomerName(){
             return customerName.getText();
         }
         
         public String getReview(){
             return writeReview.getText();
         }
         
     public void setResult(String message)
    {
        result.setText(message);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


class reviewPageView2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        ReviewPageController review = new ReviewPageController(); 
    } 
}