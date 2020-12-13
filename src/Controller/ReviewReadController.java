/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ReviewReadModel;
import Model.customerReviews;
import View.ReviewReadView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.ReviewPageView;

/**
 *
 * @author 35389
 */
public class ReviewReadController extends JFrame implements ActionListener{
    
    ReviewReadView reviewReadView;
    ReviewReadModel reviewPageModel;
    
public ReviewReadController()
{
    this.reviewReadView = new ReviewReadView(this);
    this.reviewPageModel = new ReviewReadModel();    
}

    @Override
    public void actionPerformed(ActionEvent e){
       
        if(e.getActionCommand().equals("loginHairdresser")){  
            new controller.LoginController();
        
    }
        else if(e.getActionCommand().equals("loginClient")){  
            new controller.LoginClientController();
        
    }
        else if(e.getActionCommand().equals("register")){
            
            ImageIcon icon = new ImageIcon("image/logo.png");
            
            Object[] registerChoice = {"Hairdresser", "Client"};
                Object defaultChoice = registerChoice[0];
                int optionChoosen = JOptionPane.showOptionDialog(this,
             "Who are you ?",
             "Register",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE,
             icon,
             registerChoice,
             defaultChoice);
                
                
            if (optionChoosen == 0){
                 new controller.RegisterHairDresserController(); // put the page of hairdresser register here
            }else{
                    new controller.RegisterClientController(); // call register client page
            }       
    }
        else if(e.getActionCommand().equals("   Review    ")){  
            new ReviewReadController();
            
    }
        else if(e.getActionCommand().equals("    Location    ")){  
            new Controller.LocationController();
            
    }
        else if(e.getActionCommand().equals("   Home    ")){  
            new HairDresserApplicationController();
            
    }
        else if(e.getActionCommand().equals("Add a Review")){
        new controller.ReviewPageController();
        
    }
       
        
         }
        
}
