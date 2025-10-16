package com.bala.TradeFlow.dto;

import java.util.Set;
public class UserDto {
    private Long id;
    private String userName;
    private String userEmail;
    private Set<String> roles;

    public UserDto() {}

    public UserDto(Long id, String userName, String userEmail, Set<String> roles) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.roles = roles;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }

}

