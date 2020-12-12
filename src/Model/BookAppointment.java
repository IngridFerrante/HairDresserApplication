/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalTime;

/**
 *
 * @author Kelly
 */
public class BookAppointment {
   
   
    private String nearbylocation;
    private String service;
    private String date;
    private String time;
    private String clientFirstname;
    private String clientPhonenumber;
    
    private String day; 
    private String month;
    private String year;
  

           //booking client and hairdresser
    public BookAppointment(String nearbylocation, String service, String day,String month, String year, String time, String clientFirstname, String clientPhonenumber) {
    this.nearbylocation = nearbylocation;
    this.service = service;
    this.day = day;
    this.month = month;
    this.year = year;
    this.time = time;
    this.clientFirstname = clientFirstname;
    this.clientPhonenumber = clientPhonenumber;
    }
    
     public BookAppointment(String day, String month, String year){
                this.day = day;
                this.month = month; 
                this.year = year;
            }

    
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

  //dateSchedule - declared string to get booking of the day
        String getDay(){
            return day;
        }
        String getMonth(){
            return month;
        }
        String getYear(){
            return year;
        }
        
}
    


//    public BookAppointment(int id, User location,LocalTime date, LocalTime time, Boolean available) {
//    this.location = location;
//    this.date = date;
//    this.time = time;
//    this.available = available;
//    }
//
//    public BookAppointment(User location,LocalTime date, LocalTime time, Boolean available) {
//    this.location = location;
//    this.date = date;
//    this.time = time;
//    this.available = available;
//    }

    // hairDresser Schedule page Model below: 
    
   // public class hairdresserSchedule {
//        private String day; 
//        private String month;
//        private String year;
        
        
       