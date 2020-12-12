/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ReviewPageModel;
import Model.customerReviews;
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
    ReviewPageModel reviewPageModel;
    
        public reviewPageController() 
    { 
        this.ReviewPageView = new reviewPageView (this);
        this.reviewPageModel = new ReviewPageModel();
    
    } 
        
        
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Submit")){  
            String CustomerName = ReviewPageView.getCustomerName();
            String review = ReviewPageView.getReview();
            
            customerReviews reviews = new customerReviews(CustomerName, review);
            
            boolean result = reviewPageModel.reviewClient(reviews);
            
            if(result == true)
            {
              
                ReviewPageView.setResult(CustomerName + " your review was submitted! ");
                
            }
    }
    }
    
}
