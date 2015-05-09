package com.websystique.springmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.domain.Message;
 
@Controller
public class HelloWorldRestController {
 
    @RequestMapping("/hello/{player}")
    @ResponseBody
    public Message message(@PathVariable String player) {
 
        Message msg = new Message(player, "Hello " + player);
        
        return msg;
        
    }
 
}