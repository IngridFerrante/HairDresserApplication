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
    // put the DB here 
    private String userPerson;
    private String passwordPerson;
    
    public User(String un, String pw){
        this.userPerson = un;
        this.passwordPerson = pw;
    }

    public String getUser() {
        return userPerson;
    }

    public String getPassword() {
        return passwordPerson;
    }
}