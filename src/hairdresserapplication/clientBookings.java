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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author 35389
 */
public class clientBookings extends JFrame implements ActionListener{
          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
    
    public clientBookings(){
           this.setVisible(true);
            this.setSize(600,700);
            this.setTitle("Amil's hair");

            BorderLayout frame = new BorderLayout();
            this.setLayout(frame);
            
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
            JPanel mainBooking = new JPanel();
            mainBooking.setBackground(Color.PINK);
            
            this.add(mainBooking, BorderLayout.CENTER);
            mainBooking.setLayout(null);
            
            JLabel bookingTitle = new JLabel("Your bookings: "); 
            bookingTitle.setFont(new Font("Arial", Font.PLAIN, 25)); 
            bookingTitle.setSize(200, 30); 
            bookingTitle.setLocation(150, 30);
            mainBooking.add(bookingTitle);
            
            
            //first check box and font box; 
            
            JCheckBox checkBooking = new JCheckBox();
            checkBooking.setSelected(false);
            checkBooking.setSize(45,45);
            checkBooking.setLocation(200, 120);
            checkBooking.setBackground(Color.PINK);
            mainBooking.add(checkBooking);
            
            JTextField booking1 = new JTextField();
            booking1.setSize(190, 40);
            booking1.setLocation(250, 120);
            mainBooking.add(booking1);
            
            // second check box and font box; 
            
            JCheckBox checkBooking2 = new JCheckBox();
            checkBooking2.setSelected(false);
            checkBooking2.setSize(45,45);
            checkBooking2.setLocation(200, 180);
            checkBooking2.setBackground(Color.PINK);
            mainBooking.add(checkBooking2);
            
            JTextField booking2 = new JTextField();
            booking2.setSize(190, 40);
            booking2.setLocation(250, 180);
            mainBooking.add(booking2);
            
            // third check box and font box; 
            
            JCheckBox checkBooking3 = new JCheckBox();
            checkBooking3.setSelected(false);
            checkBooking3.setSize(45,45);
            checkBooking3.setLocation(200, 250);
            checkBooking3.setBackground(Color.PINK);
            mainBooking.add(checkBooking3);
            
            JTextField booking3 = new JTextField();
            booking3.setSize(190, 40);
            booking3.setLocation(250, 250);
            mainBooking.add(booking3);
            
            // adding button to cancel selected books
            
            JButton cancelBooking = new JButton("Cancel selected Books"); 
            cancelBooking.setSize(180,40);
            cancelBooking.setLocation(250, 310);
            cancelBooking.setBackground(Color.red);
            cancelBooking.setForeground(Color.gray);
            // add an action listener to when click the button get the options selected
            mainBooking.add(cancelBooking);
            
            // adding a new button to make a new booking
            
            JButton newBooking = new JButton("Make a new Booking"); 
            newBooking.setSize(180,40);
            newBooking.setLocation(250, 370);
            newBooking.setBackground(Color.blue);
            newBooking.setForeground(Color.gray);
            newBooking.addActionListener(this);
            mainBooking.add(newBooking);
            
            
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
            
            
            validate();
            repaint();
            
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Make a new Booking")){  
            new ClientMakeBookingController();
        
    }

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}



class Test2 {
    public static void main(String[] args) throws Exception {
       clientBookings b = new clientBookings();
    }
}