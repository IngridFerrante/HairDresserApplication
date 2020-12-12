/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

import java.time.LocalTime;

/**
 *
 * @author Kelly
 */
public class Slot {
   
   
    private String nearbylocation;
    private String service;
    private String date;
    private String time;
    private String clientFirstname;
    private String clientPhonenumber;
  

           //booking client and hairdresser
    public Slot(String nearbylocation, String service, String date, String time, String clientFirstname, String clientPhonenumber) {
    this.nearbylocation = nearbylocation;
    this.service = service;
    this.date = date;
    this.time = time;
    this.clientFirstname = clientFirstname;
    this.clientPhonenumber = clientPhonenumber;
    }

//    public Slot(int id, User location,LocalTime date, LocalTime time, Boolean available) {
//    this.location = location;
//    this.date = date;
//    this.time = time;
//    this.available = available;
//    }
//
//    public Slot(User location,LocalTime date, LocalTime time, Boolean available) {
//    this.location = location;
//    this.date = date;
//    this.time = time;
//    this.available = available;
//    }
    
    //booking - declared string to get booking information
    String getNearByLocation() {
        return nearbylocation;
}
    
    String getlService() {
        return service;
}

    String getDate() {
        return date;
}

    String getTime() {
        return time;
}

    String getClientFirstName() {
        return clientFirstname;
}  
    
    String getClientPhoneNumber() {
        return clientPhonenumber;
}    

    
}