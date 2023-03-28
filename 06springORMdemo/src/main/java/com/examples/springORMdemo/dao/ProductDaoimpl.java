package com.examples.springORMdemo.dao;



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

}
