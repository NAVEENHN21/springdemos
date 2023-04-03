package com.examples.springORMdemo.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.springORMdemo.entity.Product;

@Component("productdao")
public class ProductDaoimpl implements ProductDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		// TODO Auto-generated method stub
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
		
	}

	@Override
	@Transactional
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);

	}

	@Override
	
	public Product find(int id) {
		// TODO Auto-generated method stub
		Product result=hibernateTemplate.get(Product.class,id);
		return result;
	}

	@Override
	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	
	}

}
