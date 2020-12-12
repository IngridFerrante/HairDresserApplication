/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.reviewPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.CheckOrMakeBookView;

/**
 *
 * @author 35389
 */
public class reviewPageController extends JFrame implements ActionListener{

    reviewPageView ReviewPageView;
    
        public reviewPageController() 
    { 
        this.ReviewPageView = new reviewPageView (this);
    
    } 
        
        
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
