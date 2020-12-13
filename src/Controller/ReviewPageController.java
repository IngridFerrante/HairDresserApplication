/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ReviewPageModel;
import Model.customerReviews;
import view.ReviewPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.CheckOrMakeBookView;

/**
 *
 * @author 35389
 */
public class ReviewPageController extends JFrame implements ActionListener{

    ReviewPageView reviewPageView;
    ReviewPageModel reviewPageModel;
    
        public ReviewPageController() 
    { 
        this.reviewPageView = new ReviewPageView (this);
        this.reviewPageModel = new ReviewPageModel();
    
    } 
        
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // getting action commands to the button
        if(e.getActionCommand().equals("Submit")){  
            String CustomerName = reviewPageView.getCustomerName();
            String review = reviewPageView.getReview();
            
            customerReviews reviews = new customerReviews(CustomerName, review);
            
            boolean result = reviewPageModel.reviewClient(reviews);
            
            if(result == true)
            {
              
                reviewPageView.setResult("Review Submited");
                
            }
            
            }else if(e.getActionCommand().equals("   Review    ")){  
            new Controller.ReviewReadController();
            
    } else if(e.getActionCommand().equals("    Location    ")){  
            new Controller.LocationController();
            
    }else if(e.getActionCommand().equals("   Home    ")){  
            new Controller.HairDresserApplicationController();
            
    }
            else if(e.getActionCommand().equals("loginHairdresser")){  
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
    }
    
}
