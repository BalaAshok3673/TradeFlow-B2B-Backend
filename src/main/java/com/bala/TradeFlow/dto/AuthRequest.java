package com.bala.TradeFlow.dto;

public class AuthRequest {
    private String email;
    private String password;
    private String name; // for register
    private String role; // role name for register (e.g., "ADMIN", "VENDOR", "BUYER")

    public AuthRequest() {}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
