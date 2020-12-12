/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import view.clientCheckBookingsView;

/**
 *
 * @author 35389
 */
public class reviewPage extends JFrame implements ActionListener {

          JComboBox days = null;
          JComboBox month = null;
          JComboBox year = null;
          JComboBox menuList = null;
    
    
    public reviewPage()
    {
            this.setVisible(true);
            this.setSize(600,700);
            this.setTitle("Amil's hair");

            BorderLayout frame = new BorderLayout();
            this.setLayout(frame);
            
            
            
            
            validate();
            repaint();
            
    }
            
   
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Test3 {
    public static void main(String[] args) throws Exception {
       reviewPage b = new reviewPage();
    }
}