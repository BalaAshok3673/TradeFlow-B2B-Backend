package com.bala.TradeFlow.service;

import com.bala.TradeFlow.model.UserModel;
import com.bala.TradeFlow.repository.UserRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public String registerUser(UserModel userModel){
        if (userRepository.findUsingEmail(userModel.getEmail())){
            return "Email already registered";
        }
        userRepository.save(userModel);
        return "User has been added successfully";
    }
}
