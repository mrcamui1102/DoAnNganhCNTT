/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.pojos;

/**
 *
 * @author Neet Nguyen
 */
public class User {

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String firstName;
    private String lastName;
    
    public User(){
    }
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    
}
