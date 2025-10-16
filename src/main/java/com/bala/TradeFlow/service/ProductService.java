package com.bala.TradeFlow.service;

import com.bala.TradeFlow.model.ProductModel;
import com.bala.TradeFlow.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    List<ProductModel> getAllProducts(){
       return productRepository.findAll();
    }

    Optional<ProductModel> getProductByID(long id){
        if (productRepository.findById(id).isPresent()){
            return productRepository.isProductIdExist(id);
        }
        throw new RuntimeException("product id not found");
    }

    public String addProduct(ProductModel productModel) {
        if (productRepository.existsById(productModel.getId())) {
            return "Product exist";
        }
        productRepository.save(productModel);
        return "product has been added successfully";
    }
}
