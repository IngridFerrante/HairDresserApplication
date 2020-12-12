/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.HairDresserChecksScheduleView;

/**
 *
 * @author 35389
 */
public class HairDresserChecksScheduleController extends JFrame implements ActionListener {

    HairDresserChecksScheduleView hairDresserChecksView;
    
    public HairDresserChecksScheduleController(){
        this.hairDresserChecksView = new HairDresserChecksScheduleView(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}

class Test3 {
    public static void main(String[] args) throws Exception {
       HairDresserChecksScheduleController check = new HairDresserChecksScheduleController();
    }
}
