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
public class Model {
    
        public boolean login(User user){
        
        if(user.getUser().equals("admin") && user.getPassword().equals("password")){
            return true;
        }
        return false;
        
    }
}
