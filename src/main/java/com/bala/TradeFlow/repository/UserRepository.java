package com.bala.TradeFlow.repository;

import com.bala.TradeFlow.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

    Optional<UserModel> findUsingEmail(String email);
    boolean isEmailExist(String email);
}
