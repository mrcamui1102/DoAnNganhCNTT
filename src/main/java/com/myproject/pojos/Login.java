/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Neet Nguyen
 */
@Entity
public class Login {

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    private String id;
    private String role;
    @Id
    private String username;
    private String password;
    
    Login(){
    }
    
    public Login(String id, String role, String username, String password){
        super();
        this.id=id;
        this.role = role;
        this.username = username;
        this.password = password;
        
    }
    
}
