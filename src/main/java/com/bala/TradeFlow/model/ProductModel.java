package com.bala.TradeFlow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name" , nullable = false)
    private String name;
    @Column(name = "product_price" , nullable = false)
    private double price;
    @Column(name = "product_description" , nullable = false)
    private String description;
    @Column(name = "product_quantity" , nullable = false)
    private int quantity;

    public ProductModel(){

    }

   public ProductModel(String name , double price ,String description , int quantity){
        this.name=name;
        this.price=price;
        this.description=description;
        this.quantity=quantity;
   }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
