package com.bala.TradeFlow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;
    @Column(name = "user_name" ,nullable = false )
    private String userName;
    @Column(name = "user_email" ,nullable = false , unique = true)
    private String userEmail;
    @Column(name = "user_pass" ,nullable = false)
    private String userPass;
    @Column(name = "user_role" ,nullable = false )
    private String userRole;


    public UserEntity(){

    }


    public UserEntity(long userID , String userName , String userEmail , String userPass , String userRole){
        this.userEmail=userEmail;
        this.userID=userID;
        this.userName=userName;
        this.userPass=userPass;
        this.userRole=userRole;
    }


    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
