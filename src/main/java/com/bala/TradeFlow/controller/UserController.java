package com.bala.TradeFlow.controller;

import com.bala.TradeFlow.model.UserModel;
import com.bala.TradeFlow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestParam UserModel userModel){
        userService.registerUser(userModel);
        return "User has been added successfully";
    }
}
