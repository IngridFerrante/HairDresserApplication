/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.HairDresserChecksDateScheduleModel;
import hairdresserapplication.HairDresserApplication;
import view.HairDresserChecksDateScheduleView;


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
import model.BookAppointment;

/**
 *
 * @author 35389
 */
 public class HairDresserChecksDateScheduleController extends JFrame implements ActionListener {
     
     HairDresserChecksDateScheduleView hairDressScheduleView;
     HairDresserChecksDateScheduleModel hairDresserChecksDateScheduleModel;
     
     public HairDresserChecksDateScheduleController(){

            this.hairDressScheduleView = new HairDresserChecksDateScheduleView(this);
            this.hairDresserChecksDateScheduleModel = new HairDresserChecksDateScheduleModel();
      }
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
         //   to identify different text field
        if(e.getActionCommand().equals("logout")){  
            new HairDresserApplication();
        
        }else if(e.getActionCommand().equals("ok")){
           String day = hairDressScheduleView.getDay();
           String month = hairDressScheduleView.getMonth();
           String year = hairDressScheduleView.getYear();
           
           BookAppointment schedule = new BookAppointment(day, month, year);
           
           boolean result = hairDresserChecksDateScheduleModel.scheduleHairdresser(schedule);
            
            
            if(result == true)
            {
              
                hairDressScheduleView.setResult("Booking for was successfully created.");
                
            }
           
        }
        
    }
}


class Test {
    public static void main(String[] args) throws Exception {
       HairDresserChecksDateScheduleController a = new HairDresserChecksDateScheduleController();
    }
}
