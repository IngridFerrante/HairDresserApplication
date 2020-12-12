/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HairDresserChecksScheduleController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author 35389
 */
public class HairDresserChecksScheduleView extends JFrame{
          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
          
          HairDresserChecksScheduleController hairDresserChecksController;

public HairDresserChecksScheduleView(HairDresserChecksScheduleController controller)
{
    hairDresserChecksController = controller;    
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
    menuList.addActionListener(hairDresserChecksController);
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
    
    login.addActionListener(hairDresserChecksController);
    register.addActionListener(hairDresserChecksController);
    
    //adding color to the pop up panel
     UIManager.put("OptionPane.background", Color.PINK);
     UIManager.getLookAndFeelDefaults().put("Panel.background", Color.PINK);
     //adding color to the pop up choices
     UIManager.put("JOptionPane.background", Color.PINK);
     
    //put it on the header
    header.add(rightHeader);
            // main panel
            JPanel mainScheduleChecks = new JPanel();
            mainScheduleChecks.setBackground(Color.PINK);
            
            this.add(mainScheduleChecks, BorderLayout.CENTER);
            mainScheduleChecks.setLayout(null);
            
            
             // adding a flowLayout 
        FlowLayout checksLayout = new FlowLayout(); 
            mainScheduleChecks.setLayout(checksLayout);
   
            
            //column titles
            String[] columnNames = {"name", "service","time"};
            
            //data to introduce to the Table
            Object[][] data ={ // take from DATABASE here
                {"Ingrid","Blow out","11:00"},
                {"juliana","cut", "11:30"},
            
            };
                               
            JLabel txtSchedule = new JLabel("Your Schedule: ");
            txtSchedule.setLocation(300, 120);
            txtSchedule.setFont(new Font("Arial", Font.PLAIN, 30)); 
            mainScheduleChecks.add(txtSchedule);
            
            JTable table = new JTable(data, columnNames);
            table.setPreferredScrollableViewportSize(new Dimension(500,50));
            table.setFillsViewportHeight(true);
            table.setLocation(300, 380);
            table.setSize(300, 30);
            
            JScrollPane scrollPane = new JScrollPane(table);
            mainScheduleChecks.add(scrollPane);
            
            //make the table be clickable 
            ListSelectionModel model=table.getSelectionModel();
            model.addListSelectionListener(new ListSelectionListener(){
           
                @Override
            public void valueChanged(ListSelectionEvent e) {
                // if not model is selection empty
                if(! model.isSelectionEmpty()){
                    
                    // get selected row
                    int selectedRow=model.getMinSelectionIndex();
                    // and do: 
                    System.out.println("selected" + selectedRow);
                }
            }
            
    });
            
           JButton cancelSchedule = new JButton("Cancel Selected Booking");
           cancelSchedule.setSize(300, 40);
           cancelSchedule.setLocation(300, 400);
           cancelSchedule.setBackground(Color.red);
           cancelSchedule.setForeground(Color.white);
           mainScheduleChecks.add(cancelSchedule);
            
           JButton makeSchedule = new JButton("Make a new Booking");
           makeSchedule.setSize(300, 40);
           makeSchedule.setLocation(300, 450);
           makeSchedule.setBackground(Color.blue);
           makeSchedule.setForeground(Color.white);
           mainScheduleChecks.add(makeSchedule);
           
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

public void attributesSetter(){ 
      this.setVisible(true);
        this.setSize(600,700);
        this.setTitle("Amil's hair");

        BorderLayout frame = new BorderLayout();
        this.setLayout(frame);
}
   private void validation(){
        this.validate();
        this.repaint();
    }
}
