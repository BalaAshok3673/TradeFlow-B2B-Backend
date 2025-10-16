package com.bala.TradeFlow.repository;
import com.bala.TradeFlow.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserEmail(String email);
    boolean existsByUserEmail(String email);
}
