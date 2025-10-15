package com.bala.TradeFlow.controller;

import com.bala.TradeFlow.model.UserModel;
import com.bala.TradeFlow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        return userService.registerUser(userModel);
    }
}
