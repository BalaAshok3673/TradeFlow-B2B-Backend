package com.bala.TradeFlow.controller;

import com.bala.TradeFlow.entity.UserEntity;
import com.bala.TradeFlow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @GetMapping
    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }
}
