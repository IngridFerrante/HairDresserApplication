/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HairDresserApplicationView;

/**
 *
 * @author 35389
 */
public class HairDresserApplicationController {
    
    HairDresserApplicationView hairDresserApplicationView;
    
    
    public HairDresserApplicationController(){
        this.hairDresserApplicationView = new HairDresserApplicationView(this);
    }
    
    
    
    
}
