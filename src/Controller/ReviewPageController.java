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
import javax.swing.JFrame;
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
        if(e.getActionCommand().equals("Submit")){  
            String CustomerName = reviewPageView.getCustomerName();
            String review = reviewPageView.getReview();
            
            customerReviews reviews = new customerReviews(CustomerName, review);
            
            boolean result = reviewPageModel.reviewClient(reviews);
            
            if(result == true)
            {
              
                reviewPageView.setResult(CustomerName + " your review was submitted! ");
                
            }
    }
    }
    
}
