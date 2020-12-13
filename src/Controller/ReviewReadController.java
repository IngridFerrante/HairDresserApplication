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
import javax.swing.JFrame;

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
       
        // i don;t fucking know whats going on here 
       
        
         }
         
         
         
        


}
