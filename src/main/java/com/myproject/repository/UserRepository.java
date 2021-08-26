/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.repository;

import com.myproject.pojos.User;
import java.util.List;

/**
 *
 * @author Neet Nguyen
 */
public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
    
}
