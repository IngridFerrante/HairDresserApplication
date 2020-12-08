/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author 35389
 */
public class HairDresserChecksController extends JFrame implements ActionListener {

    HairDresserChecksView hairDresserChecksView;
    
    public HairDresserChecksController(){
        this.hairDresserChecksView = new HairDresserChecksView(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Test3 {
    public static void main(String[] args) throws Exception {
       HairDresserChecksController check = new HairDresserChecksController();
    }
}
