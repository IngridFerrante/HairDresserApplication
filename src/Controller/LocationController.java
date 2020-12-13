/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import view.LocationView;

/**
 *
 * @author 35389
 */
public class LocationController {
    LocationView locationView;
    


    public LocationController()
{
    this.locationView = new LocationView(this);
}
    

}
