/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 35389
 */
public class HairDresserApplication extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HairDresserApplication();
       
    }
    public HairDresserApplication(){
        this.MainPage();
    }
    
public void MainPage()
{
    //Frame
    this.setVisible(true);
    this.setSize(600,700);
    this.setTitle("Amil's hair");
    
    
    
    BorderLayout frame = new BorderLayout();
    this.setLayout(frame);
    
    // header
    JPanel header = new JPanel(); // creating header
    
    
    GridLayout headerLayout = new GridLayout(1,3); // adding a grid to the header 1 row and 3 columns
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
    leftHeader.add(menuList);
    System.out.println(menuList.getSelectedItem());
    
    menuList.setBackground(Color.GRAY);
    menuList.setForeground(Color.PINK);
    
    header.add(leftHeader);
    
    
    // organizing the center hand side
    JPanel centreHeader = new JPanel();
    FlowLayout centreLayout = new FlowLayout();
    centreHeader.setLayout(centreLayout);
    centreLayout.setAlignment(FlowLayout.CENTER);
    centreHeader.setBackground(Color.BLACK);
   

    
    JLabel logo = new JLabel();
    logo.setIcon(new ImageIcon("image/logo.png"));
    
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
    
    //put it on the header
    header.add(rightHeader);
    
    // Main Area
    JPanel main = new JPanel(); // creating the main panel
    BorderLayout mainLayout = new BorderLayout();
    main.setLayout(mainLayout);
    this.add(main, BorderLayout.CENTER); // adding it to the frame
    
    JPanel mainCenter = new JPanel();
    mainCenter.setBackground(Color.PINK);
    
    main.add(mainCenter);
    
    // adding a grid to devide the photo and the promotion into 2 sections
    GridLayout photoPromotion = new GridLayout(1,2);
    mainCenter.setLayout(photoPromotion);
    
    // organising the left side
    JPanel leftMain = new JPanel();
    mainCenter.add(leftMain);
    leftMain.setBackground(Color.PINK);
    
    
    JLabel photo = new JLabel();
    photo.setIcon(new ImageIcon("image/photo.png"));
    
    leftMain.add(photo);
 
    // organising the right side
    JPanel rightMain = new JPanel();
    mainCenter.add(rightMain);
    rightMain.setBackground(Color.PINK);
    
    JLabel promotion = new JLabel("Promotion goes here");
    rightMain.add(promotion);
    
    
//    //Main down part
//        JPanel mainDown = new JPanel();
//        BorderLayout mainDownLayout = new BorderLayout();
//        mainDown.setLayout(mainDownLayout);
//        this.add(mainDown, BorderLayout.SOUTH); // added to the frame
//        
//        JPanel minimainDown = new JPanel();
//        mainDown.setBackground(Color.gray);
//        
//        //devide the services into 4 (one row and 4 columns) 
//        GridLayout miniMainLayout = new GridLayout(1,4);
//        minimainDown.setLayout(miniMainLayout);
//        
//        //organizing left side
//        JPanel miniMainLeft = new JPanel();
//        mainDown.add(miniMainLeft);
//        miniMainLeft.setBackground(Color.GRAY);
//        // WE CAN ADD A FLOW LAYOUT MANAGER HERE TO PUT IT IN THE MIDDLE
//        JLabel squares = new JLabel("squares");
//        miniMainLeft.add(squares);
        

// FOOTER
    
        JPanel footer = new JPanel(); // creating header
    
    
        GridLayout footerLayout = new GridLayout(1,3); // adding a grid to the header 1 row and 3 columns
        footer.setLayout(footerLayout);
        footer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));

        //add the panel to the frame
        this.add(footer, BorderLayout.PAGE_END);

      
        
        
        
        
       
        
        
    
    
    
    
   this.validate();
   this.repaint();
    
    
    
}

@Override

    public void actionPerformed(ActionEvent e) {

//        to identify different text field
        if(e.getActionCommand().equals("login")){  
            System.out.println("Thanks for select the login!");
        
    }
        else if(e.getActionCommand().equals("register")){
            System.out.println("Button register clicked!");
    } 
  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    }
    
   
            
    