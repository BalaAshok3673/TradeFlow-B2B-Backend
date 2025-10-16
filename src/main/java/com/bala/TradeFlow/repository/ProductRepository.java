package com.bala.TradeFlow.repository;

import com.bala.TradeFlow.model.ProductModel;
import com.bala.TradeFlow.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel , Long> {

    Optional<ProductModel> isProductIdExist(long id);
}
