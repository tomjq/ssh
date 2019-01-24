package com.tomjava.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.tomjava.dao.ProductDAO;
import com.tomjava.pojo.Product;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO{
	
	public List<Product> list() {
		return find("from Product");
	}

	@Override
	public void add(Product p) {
		save(p);
	}

	@Override
	public Product get(int id) {
		return (Product)get(Product.class,id);
	}

	@Override
	public void update(Product p) {
		super.update(p);
		
	}

	@Override
	public void delete(Product p) {
		super.delete(p);
	}
	
}
