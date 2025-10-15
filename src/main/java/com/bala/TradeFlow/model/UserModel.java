package com.bala.TradeFlow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="user_name" , nullable = false)
    private String name;

    @Column(name = "user_email" , nullable = false , unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private RoleModel role;

    public UserModel(String name , String email , String password  , RoleModel role){
        this.name=name;
        this.role=role;
        this.password=password;
        this.email=email;
    }

    public UserModel(){

    }
}
