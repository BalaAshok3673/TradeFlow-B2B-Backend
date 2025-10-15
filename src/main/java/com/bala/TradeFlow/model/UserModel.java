package com.bala.TradeFlow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
