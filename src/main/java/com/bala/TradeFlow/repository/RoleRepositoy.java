package com.bala.TradeFlow.repository;

import com.bala.tradeflow.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(String name);
    boolean existsByName(String name);
}
