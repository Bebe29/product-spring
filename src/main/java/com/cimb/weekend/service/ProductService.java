package com.cimb.weekend.service;

import com.cimb.weekend.entity.Product;

public interface ProductService {
	public Iterable<Product> getProduct();
	
	public Product addProduct(Product product);
	
	public void deleteProductById(int productId);
	
	public Product updateProduct(int productId, Product product);
}
