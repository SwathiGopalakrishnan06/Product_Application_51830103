package com.productapp.model.service;

import java.util.List;

import com.productapp.model.entities.Product;

public interface ProductService {
	public List<Product> findByNameContaining(String name);
	public Product findByName(String name);
	public Product findById(Long id);
}
