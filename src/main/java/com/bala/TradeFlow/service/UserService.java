package com.bala.TradeFlow.service;


import com.bala.TradeFlow.entity.UserEntity;
import com.bala.TradeFlow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserEntity registerUser(UserEntity user);
    UserEntity getUserByEmail(String email);
    List<UserEntity> listUser();

}

@Service
class UserServiceImpl implements UserService{

    private  UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserEntity registerUser(UserEntity user){
        if (userRepository.isEmailExist(user.getUserEmail())){
            throw new IllegalArgumentException("E-mail ID already existed");
        }

        return userRepository.save(user);
    }

    @Override
   public List<UserEntity> listUser(){
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserByEmail(String email){
        return  (userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }


}
