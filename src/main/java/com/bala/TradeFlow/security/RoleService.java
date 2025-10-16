package com.bala.TradeFlow.security;
import com.bala.TradeFlow.entity.RoleEntity;
public class RoleService {
    RoleEntity getByName(String name);
    void initializeDefaultRoles();
}


