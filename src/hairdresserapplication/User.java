/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairdresserapplication;

/**
 *
 * @author 35389
 */
public class User {


    
    private String un;
    private String pw;
    
    private String location;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String passwordUser;
    
    public User(String un, String pw){
        this.un = un;
        this.pw = pw;
    }
    
    //Register Hairdresser
    public User(String location, String firstName, String lastName, String emailAddress, String phoneNumber, String passwordUser) {
        this.location = location;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.passwordUser = passwordUser;
    }

    public User(String firstName, String lastName, String emailAddress, String phoneNumber, String passwordUser) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.passwordUser = passwordUser;
    }

//        //Register Hairdresser
//    public User(String location, String firstName, String lastName, String emailAddress, String phoneNumber, String passwordUser) {
//    this.location = location;
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.emailAddress = emailAddress;
//    this.phoneNumber = phoneNumber;
//    this.passwordUser = passwordUser;
//    
//    }

    public String getUn() {
        return un;
    }

    public String getPw() {
        return pw;
    }
    
    

    String getLocation() {
        return location;
   }

    String getfName() {
        return firstName;
 }

    String getlName() {
        return lastName;
  }

    String getEmail() {
        return emailAddress;
}

    String getPhoneNumber() {
        return phoneNumber;
 }

    String getPassword() {
        return passwordUser;
}


}
