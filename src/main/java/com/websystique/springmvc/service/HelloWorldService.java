package com.websystique.springmvc.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.model.UserDao;
 
@Service
public class HelloWorldService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public User createUser(){
        User user=new User();
        user.setName("Teja");
        user.setText("An Awesome Guy");
        user=userDao.save(user);
        return user;
    }
    
    @Transactional
    public List<User> finf(){
        return userDao.findByName("Teja");
    }
 
}