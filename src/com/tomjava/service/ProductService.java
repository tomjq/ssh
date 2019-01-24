package com.tomjava.service;

import java.util.List;

import com.tomjava.pojo.Product;

public interface ProductService {
	
	public List<Product> list();
	public void add(Product p);
	public Product get(int id);
	public void update(Product p);
	public void delete(Product p);
}
