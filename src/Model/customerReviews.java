/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 35389
 */
public class customerReviews {
    
    private String customerName;
    private String review; 
   
    
    public customerReviews(String customerName, String review){
        this.customerName = customerName; 
        this.review = review;
    }

 
    public String getCustomerName(){
        return customerName;
    }
    
    public String getReview(){
        return review;
    }
   
    public void setCustomerName(String customerName ){
        this.customerName = customerName;
    }
    
    public void setReview(String review ){
        this.review = review;
    }

  
    
    
    
}
