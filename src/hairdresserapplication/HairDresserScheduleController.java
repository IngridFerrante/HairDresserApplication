/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author 35389
 */
 class HairDresserScheduleController extends JFrame implements ActionListener {
     
     HairDresserScheduleView hairDressScheduleView;
     
     public HairDresserScheduleController(){

            this.hairDressScheduleView = new HairDresserScheduleView(this);
     }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}


class Test {
    public static void main(String[] args) throws Exception {
       HairDresserScheduleController a = new HairDresserScheduleController();
    }
}
