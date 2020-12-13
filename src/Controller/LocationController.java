/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.LocationView;

/**
 *
 * @author 35389
 */
public class LocationController extends JFrame implements ActionListener {
    LocationView locationView;
    
    public LocationController()
{
    this.locationView = new LocationView(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Location")){  
            new LocationController();
        
    }else if(e.getActionCommand().equals("Review")){  
            new controller.CheckOrMakeBookController();
        
    }
    }
    

}
