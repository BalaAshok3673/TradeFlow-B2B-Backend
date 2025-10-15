package com.bala.TradeFlow.repository;

import com.bala.TradeFlow.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity , Long> {

    boolean isEmailExist(String userEmail);
    public Optional<UserEntity> findByEmail(String userEmail);

}
