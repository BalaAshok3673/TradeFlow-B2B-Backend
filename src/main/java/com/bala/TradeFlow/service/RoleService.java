package com.bala.TradeFlow.service;

import com.bala.TradeFlow.entity.RoleEntity;
import com.bala.TradeFlow.repository.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;


public interface RoleService {
    void intializeRoles();
    RoleEntity getRoleByName(String name);
}

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }

    @Override
    @PostConstruct
    public void intializeRoles(){
        if (roleRepository.count() == 0){
            RoleEntity adminRole = new RoleEntity();
            adminRole.setName("ADMIN");
            roleRepository.save(adminRole);
        }
    }
}


