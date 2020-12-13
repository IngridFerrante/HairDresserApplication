/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HairDresserChecksDateScheduleController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Kelly
 */
public class HairDresserChecksDateScheduleView extends JFrame {
     // Components of the dateSchedule form 
    JComboBox days = null;
    JComboBox month = null;
    JComboBox year = null;
    JComboBox menuList = null;
    private JLabel result;
    
    HairDresserChecksDateScheduleController hairDresserScheduleController;
    
    public HairDresserChecksDateScheduleView(HairDresserChecksDateScheduleController controller)
    {
        hairDresserScheduleController = controller;    
        attributesSetter();
        components();
        validation();
    }
    private void components()
    {
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
    menuList.addActionListener(hairDresserScheduleController);
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
    
    //add button  logout
    JButton logout = new JButton("Logout");
   
    rightHeader.add(logout); 
    
    logout.setBackground(Color.GRAY);
    logout.setForeground(Color.pink);
    
    
    logout.setActionCommand("logout");
    
    logout.addActionListener(hairDresserScheduleController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
            
            
          
            //main Area
    JPanel mainArea = new JPanel(); // creating the main panel
  
     //adding a layout to the dropdown and button
     FlowLayout scheduleBtn = new FlowLayout(); 
     mainArea.setLayout(scheduleBtn);
     mainArea.setBackground(Color.PINK);
     
     //adding the panel to the frame
     this.add(mainArea, BorderLayout.CENTER);
     
     
     //left hand side
     
    
     JLabel txt = new JLabel("Schedule: ");
     mainArea.add(txt);
             
     JPanel leftMain = new JPanel();
     FlowLayout leftlayoutMain = new FlowLayout();
     leftMain.setLayout(leftlayoutMain);
     leftlayoutMain.setAlignment(FlowLayout.LEFT);
     leftMain.setBackground(Color.PINK);
     
       String[]  dates 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" };
       
       String[] months
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" };
       
       String[] years
               = {"2020","2021"};
    
    days = new JComboBox(dates);
  
  //  days.addActionListener(this); ADD AN ACTION LISTENER LATER
    days.setActionCommand("days");
    days.setBackground(Color.GRAY);
    days.setForeground(Color.PINK);
    days.addActionListener(hairDresserScheduleController);

     
    
    leftMain.add(days);
    
    
    //adding to the main panel 
    
    mainArea.add(leftMain);
    
    // center 
    
    JPanel centerMain = new JPanel();
    FlowLayout centerLayout = new FlowLayout();
    centerMain.setLayout(centerLayout);
    centerLayout.setAlignment(FlowLayout.CENTER);
    centerMain.setBackground(Color.PINK);
    
    // add the month drop down
    
    month = new JComboBox(months);
   
   // month.addActionListener(this);
    month.setActionCommand("month");
    month.setBackground(Color.GRAY);
    month.setForeground(Color.PINK);
    month.addActionListener(hairDresserScheduleController);
   
    
   centerMain.add(month);
   
   //adding to the main panel 
   mainArea.add(centerMain);
   
   // right side
   JPanel rightMain = new JPanel();
   FlowLayout rightLayought = new FlowLayout();
   rightLayought.setAlignment(FlowLayout.RIGHT);
   rightMain.setBackground(Color.PINK);
   
    year = new JComboBox(years);
  
  //  year.addActionListener(this);
    year.setActionCommand("year");
    year.setBackground(Color.GRAY);
    year.setForeground(Color.PINK);
    year.addActionListener(hairDresserScheduleController);
    
    rightMain.add(year); 
    
    //adding to the main panel 
   mainArea.add(rightMain);
    
   
   JButton okBtn = new JButton("ok");
   okBtn.addActionListener(hairDresserScheduleController); 
   mainArea.add(okBtn);
   
        result = new JLabel(""); 
        result.setFont(new Font("Arial", Font.PLAIN, 12)); 
        result.setSize(500, 20); 
        result.setLocation(10, 360); 
        mainArea.add(result);
   
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
    
    // Setting attributes
    private void attributesSetter(){
        this.setVisible(true);
        this.setSize(600,700);
        this.setTitle("Amil's hair");

        BorderLayout frame = new BorderLayout();
        this.setLayout(frame);
    }
    
     private void validation(){
        this.validate();
        this.repaint();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops running when the window is closed 
    }
     
     public String getDay(){
         return (String) days.getSelectedItem();
     }
     public String getMonth(){
         return (String) month.getSelectedItem();
     }
     public String getYear(){
         return (String) year.getSelectedItem();
     }
     public void setResult(String message)
    {
        result.setText(message);
    }
}

class dateSchedule {
    public static void main(String[] args) throws Exception {
       HairDresserChecksDateScheduleController a = new HairDresserChecksDateScheduleController();
    }
}