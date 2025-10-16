package com.bala.TradeFlow.security;

public class UserService {
    UserEntity registerUser(String name, String email, String password, String roleName);
    List<UserDto> getAllUsers();
    UserEntity findByEmail(String email);
}
