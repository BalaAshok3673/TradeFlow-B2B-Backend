package com.bala.TradeFlow.security;
import com.bala.TradeFlow.repository.RoleRepository;
import com.bala.TradeFlow.entity.RoleEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleEntity getByName(String name) {
        return roleRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Role not found: " + name));
    }

    @Override
    public void initializeDefaultRoles() {
        if (!roleRepository.existsByName("ADMIN")) {
            roleRepository.save(new RoleEntity("ADMIN"));
        }
        if (!roleRepository.existsByName("VENDOR")) {
            roleRepository.save(new RoleEntity("VENDOR"));
        }
        if (!roleRepository.existsByName("BUYER")) {
            roleRepository.save(new RoleEntity("BUYER"));
        }
    }
}
