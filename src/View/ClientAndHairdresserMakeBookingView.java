/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClientAndHairdresserMakeBookingController;

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
 * @author Kelly
 */
public class ClientAndHairdresserMakeBookingView extends JFrame{
    
    // Components of the clientandHAirdresserMakeBooking form 
    private JLabel title;  
    private JButton BookButton;
    private JLabel FirstName;
    private JTextField textClientFirstName; 
    private JLabel phone;
    private JTextField textphone; 
    private JLabel result;
    JComboBox menuLocation = null; 
    JComboBox menuService = null; 
    JComboBox menuDate = null; 
    JComboBox menuHour = null;
    
    private JComboBox day; 
    private JComboBox month; 
    private JComboBox year; 
    //set calendar conponents
    private String days[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec"  }; 
    private String years[] 
        = { "2020", "2021"}; 
    
    ClientAndHairdresserMakeBookingController clientMakeBookingController;
    public ClientAndHairdresserMakeBookingView(ClientAndHairdresserMakeBookingController controller)
    {
        clientMakeBookingController = controller;
        attributesSetter();
        components();
        validation();
    }
    
     private void components(){
         // header starts   
         
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
    
     JButton backButton = new JButton("Back");
    backButton.addActionListener(clientMakeBookingController);
    backButton.setBackground(Color.gray);
    backButton.setForeground(Color.PINK);
    
    leftHeader.add(backButton);
    
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
    
    //add button logout
    JButton logout = new JButton("Logout");
    rightHeader.add(logout); //add button
    
    //set colour
    logout.setBackground(Color.GRAY);
    logout.setForeground(Color.pink);
    
    logout.addActionListener(clientMakeBookingController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
    
    //ends header****************************
        
       
    
    //starts main Make a book page 
        JPanel rp = new JPanel(); // creating the main panel
        rp.setBackground(Color.PINK);

        //adding the panel to the frame
        this.add(rp, BorderLayout.CENTER);
        rp.setLayout(null); 
        
        //title on top page 
        title = new JLabel("Make a Book"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 40); 
        title.setLocation(205, 20); 
        rp.add(title); 

        //dropdown box showing the location
        String[] menuLocationBook = { "Salon Location","FoxRock", "Ballsbridge" };
        menuLocation = new JComboBox(menuLocationBook);
        menuLocation.setSelectedIndex(0);
        menuLocation.addActionListener(clientMakeBookingController);
        menuLocation.setSize(200, 40); // set box size
        menuLocation.setLocation(190, 80);//set location inside the panel
        menuLocation.setBackground(Color.GRAY);//set button color
        menuLocation.setForeground(Color.PINK);//set text button color
        rp.add(menuLocation);
        
        //dropdown box showing the service
        String[] menuServiceBook = { "Choose a Service","Cut", "BlowDry","Colour", "Styling" };
        menuService = new JComboBox(menuServiceBook);
        menuService.setSelectedIndex(0);
        menuService.addActionListener(clientMakeBookingController);
        menuService.setSize(200, 40); 
        menuService.setLocation(190, 130);
        menuService.setBackground(Color.GRAY);//set button color
        menuService.setForeground(Color.PINK);//set text button color
        rp.add(menuService);    
        
        //dropdown box - set day, month and year bot inside panel
        day = new JComboBox(days);
        day.addActionListener(clientMakeBookingController);
        day.setSize(60, 40); 
        day.setLocation(190, 180);
        day.setBackground(Color.GRAY);//set button color
        day.setForeground(Color.PINK);//set text button color
        rp.add(day);
        
        month = new JComboBox(months);
        month.addActionListener(clientMakeBookingController);
        month.setSize(60, 40); 
        month.setLocation(250, 180);
        month.setBackground(Color.GRAY);//set button color
        month.setForeground(Color.PINK);//set text button color
        rp.add(month);
        
        year = new JComboBox(years);
        year.addActionListener(clientMakeBookingController);
        year.setSize(80, 40); 
        year.setLocation(310, 180);
        year.setBackground(Color.GRAY);//set button color
        year.setForeground(Color.PINK);//set text button color
        rp.add(year);
             
        //pick hour //----- later try to make a loop to take a picked hour from the array
        String[] menuHourBook = { "Choose an hour","10:00","12:00", "14:00", "16:00"};
        menuHour = new JComboBox(menuHourBook);
        menuHour.setSelectedIndex(0);
        menuHour.addActionListener(clientMakeBookingController);
        menuHour.setSize(200, 40); 
        menuHour.setLocation(190, 230);
        menuHour.setBackground(Color.GRAY);//set button color
        menuHour.setForeground(Color.PINK);//set text button color
        rp.add(menuHour); 
        
        //first name created in case the client make a book to another person (as a friend or relative)
        FirstName = new JLabel("First Name");      
        FirstName.setSize(200, 30); 
        FirstName.setLocation(190, 265); 
        FirstName.setForeground(Color.gray);      
        rp.add(FirstName); 
        
        //field to insert name
        textClientFirstName = new JTextField(20);
        textClientFirstName.setSize(200, 30); 
        textClientFirstName.setLocation(190, 285); 
        textClientFirstName.setBackground(Color.gray);
        textClientFirstName.addActionListener(clientMakeBookingController); 
        rp.add(textClientFirstName); 
        
        //first name created in case the client make a book to another person, and the hair dresser can contact directly
        phone = new JLabel("Phone Number");
        phone.setSize(200, 30); 
        phone.setLocation(190, 310); 
        phone.setForeground(Color.gray);      
        rp.add(phone);         
  
        textphone = new JTextField(20);
        textphone.setSize(200, 30); 
        textphone.setLocation(190, 330); 
        textphone.setBackground(Color.gray);
        textphone.addActionListener(clientMakeBookingController); 
        rp.add(textphone); 
        
        //send all the information above to database
        BookButton = new JButton("Make a Book"); 
        BookButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        BookButton.setSize(200, 40); 
        BookButton.setLocation(190, 380); 
        BookButton.setBackground(Color.blue);
        BookButton.addActionListener(clientMakeBookingController); 
        rp.add(BookButton); 

        //set message result to the client
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
        this.setTitle("Amil's hair");
        setResizable(false); 
    }
    
     private void validation(){
        this.validate();
        this.repaint();
    }
    
     // getters for the booking 
    public String getNearByLocation(){
        return (String) menuLocation.getSelectedItem();
    }
    public String getlService(){
        return (String) menuService.getSelectedItem();     
    }
    public String getDay(){
        return (String) day.getSelectedItem();
    }
    public String getMonth(){
        return (String) month.getSelectedItem();
    }
    public String getYear(){
        return (String) year.getSelectedItem();
    }
    public String getTime(){
        return (String) menuHour.getSelectedItem();
    }
    public String getClientFirstName(){
        return FirstName.getText();
    }
    public String getClientPhoneNumber(){
        return textphone.getText();
    }

     public void setResult(String message)
    {
        result.setText(message);
    }
     
     public String getDaymini(){
         return (String) day.getSelectedItem();
     }
     
     public String getMonthmini(){
         return (String) month.getSelectedItem();
     }
      
     public String getYearmini(){
         return (String) year.getSelectedItem();
     }
     
      
}

// Driver Code - main method to unable seeing the page individually
class ClientBooking { 
  
    public static void main(String[] args) throws Exception 
    { 
        ClientAndHairdresserMakeBookingController checkorbookController = new ClientAndHairdresserMakeBookingController(); 
    } 
}

