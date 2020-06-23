package com.cimb.weekend.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cimb.weekend.dao.ProductRepo;
import com.cimb.weekend.entity.Product;
import com.cimb.weekend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	@Transactional
	public Iterable<Product> getProduct() {
		return productRepo.findAll();
	}
	
	@Override
	@Transactional
	public Product addProduct(Product product) {
		product.setId(0);
		return productRepo.save(product);
	}
	
	@Override
	@Transactional
	public void deleteProductById(int productId) {
		Product findProduct = productRepo.findById(productId).get();
		this.productRepo.delete(findProduct);
	}
	
	@Override
	@Transactional
	public Product updateProduct(int productId, Product product) {
		Product findProduct = productRepo.findById(productId).get();
		return productRepo.save(product);
	}
}
