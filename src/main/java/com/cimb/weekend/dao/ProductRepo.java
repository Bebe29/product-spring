package com.cimb.weekend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.weekend.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
