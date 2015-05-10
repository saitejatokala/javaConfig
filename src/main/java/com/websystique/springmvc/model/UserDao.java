package com.websystique.springmvc.model;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserDao extends PagingAndSortingRepository<User, Long> {
    
    public List<User> findByName(String name);
}