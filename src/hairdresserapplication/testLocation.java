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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 35389
 */
public class testLocation extends JFrame implements ActionListener{
    
    public testLocation(){
           this.setVisible(true);
            this.setSize(600,700);
            this.setTitle("Amil's hair");

            BorderLayout frame = new BorderLayout();
            this.setLayout(frame);
            
            //main
             JPanel mainLocation = new JPanel();
            mainLocation.setBackground(Color.PINK);
            
            this.add(mainLocation, BorderLayout.CENTER);
            mainLocation.setLayout(null);
            
         
            //add a grid
            GridLayout LocationLayout = new GridLayout(2,2); 
            mainLocation.setLayout(LocationLayout);
            
            JPanel leftLocation = new JPanel(); 
            FlowLayout locationLayout = new FlowLayout();
            leftLocation.setLayout(locationLayout);
            locationLayout.setAlignment(FlowLayout.LEFT);
            leftLocation.setBackground(Color.BLACK);
            
            JLabel photo = new JLabel();
            photo.setIcon(new ImageIcon("image/mapLocationOne.png"));
            photo.setSize(new Dimension(50,50));
            leftLocation.add(photo);
            
            
            mainLocation.add(leftLocation);
            
            validate();
            repaint();
            
    
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Test4 {
    public static void main(String[] args) throws Exception {
       testLocation c = new testLocation();
    }
}
