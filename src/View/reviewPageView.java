/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.reviewPageController;
import controller.CheckOrMakeBookController;
import hairdresserapplication.reviewPage;
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
public class reviewPageView extends JFrame implements ActionListener {
          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
          private JLabel cName;
          private JTextArea writeReview;
          private JLabel result;
          
    reviewPageController ReviewPageController;


    public reviewPageView(reviewPageController controller)
    {
        ReviewPageController = controller;
        attributesSetter();
        components();
        validation();
    }

    public reviewPageView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    //add drowndrop list
    
    String[] menuApp = { "Home", "Location", "Review" };
    
     menuList = new JComboBox(menuApp);
    menuList.setSelectedIndex(2);
    menuList.addActionListener(this);
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
    
    login.addActionListener(this);
    register.addActionListener(this);
    
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
            
            JLabel reviewTitle = new JLabel("How was the service ? "); 
            reviewTitle.setFont(new Font("Arial", Font.PLAIN, 25)); 
            reviewTitle.setSize(300, 25); 
            reviewTitle.setLocation(150, 20);
            mainReview.add(reviewTitle);
            
            JLabel cName = new JLabel("Name: ");
            cName.setFont(new Font("Arial", Font.PLAIN, 18)); 
            cName.setSize(300, 30);
            cName.setLocation(150, 60);
            mainReview.add(cName);
            
           JTextField customerName = new JTextField();
           customerName.setSize(300, 30);
           customerName.setLocation(150, 85);
           customerName.setBackground(Color.GRAY);
           customerName.setForeground(Color.white);
           mainReview.add(customerName);
           
            JTextArea writeReview = new JTextArea("My experience: ", 50, 50);
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
            sendReview.addActionListener(ReviewPageController);
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
             return cName.getText();
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

    }
    
}


class reviewPageView2 { 
  
    public static void main(String[] args) throws Exception 
    { 
        reviewPageController review = new reviewPageController(); 
    } 
}