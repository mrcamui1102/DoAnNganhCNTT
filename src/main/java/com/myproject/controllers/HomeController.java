/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.controllers;

import com.myproject.pojos.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Neet Nguyen
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model,
            @RequestParam Map<String, String> params ){
        String firstName = params.get("first_name");
        String lastName = params.get("last_name");
        if(firstName!=null && lastName!=null)
            model.addAttribute("name", String.format("%s %s", firstName, lastName));
        else
            model.addAttribute("name", "Lap");
        
        
        model.addAttribute("user", new User());
        
        List<User> users = new ArrayList<>();
        users.add(new User("Lap", "Nguyen"));
        users.add(new User("Dao", "Nguyen"));
        users.add(new User("Ky", "Nguyen"));
        
        model.addAttribute("users", users);
                
        
        return "index";
    }
    
    @RequestMapping("/hello/{name}")
    public String hello(Model model, 
            @PathVariable(value="name") String name){
        model.addAttribute("message", "Welcome" + name +"!!!");
        return "hello";
    }
    
    @RequestMapping(path="/hello-post", method=RequestMethod.POST)
    public String show(Model model, @ModelAttribute(value="user") User user){
        model.addAttribute("fullName", user.getFirstName() + " " + user.getLastName());
        
        return "index";
        
    }
    
    @RequestMapping(path="/test")
    public String testRedirect(Model model){
        model.addAttribute("testMsg", "Welcome redirect");
        
        return "redirect:/hello/Lap";
        
    }
    
    
}
