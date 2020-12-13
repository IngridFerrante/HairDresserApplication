/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import Controller.HairDresserApplicationController;
import controller.LoginController;
import controller.RegisterClientController;
import controller.RegisterHairDresserController;
import controller.ReviewPageController;
import view.ReviewPageView;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import view.LocationView;

/**
 *
 * @author 35389
 */
public class HairDresserApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //main page
        new HairDresserApplicationController();

    }

    }
    
   
    //main page of the program
    // this program we used MVC to build the wedsite, some pages are dupicated to provide 
    // different access for different users, hairdresser or client, we studied and understood a lot about
    //GUI programming in general during this assigment. The use of same page to get different user was successfully
    //created in User class for example. We used most of the tools that we learned in class and learned more about
    // their functionalities. 
    
    //link GITHUB: 