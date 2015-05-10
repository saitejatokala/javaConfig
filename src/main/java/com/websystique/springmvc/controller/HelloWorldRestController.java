package com.websystique.springmvc.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.websystique.springmvc.model.Message;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.HelloWorldService;
 
@Controller
public class HelloWorldRestController {
 
    @Autowired
    private HelloWorldService hws;
    
    @RequestMapping("/hello/{player}")
    @ResponseBody
    public Message message(@PathVariable String player) {
 
        Message msg = new Message(player, "Hello " + player);
        
        return msg;
        
    }
    
    
    @RequestMapping("/hello1")
    @ResponseBody
    public User message12() {
 
        
        return hws.createUser();
        
    }
    @RequestMapping("/hello2")
    @ResponseBody
    public List<User> message1() {
 
/*        hws.createUser();*/
        return hws.finf();
        
    }
 
}