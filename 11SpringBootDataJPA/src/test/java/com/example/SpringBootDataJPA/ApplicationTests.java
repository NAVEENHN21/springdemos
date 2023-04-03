package com.example.SpringBootDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.SpringBootDataJPA.entity.Product;
import com.example.SpringBootDataJPA.repository.ProductRepository;



@SpringBootTest

class ApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void createProduct() {
		Product product=new Product();
		product.setName("laptop");
		product.setDescription("Bluetooth");
		product.setPrice(2000.0);
		
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		productRepository.save(product);
	}
	
	@Test
	void readProduct() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		java.util.Optional<Product> optionalProduct= productRepository.findById(1);
		if(optionalProduct.isPresent()) {
			Product product=optionalProduct.get();
			System.out.println(product);
		}else {
			System.out.println("");

		}
	}
	@Test
	void updateProduct() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		java.util.Optional<Product> optionalProduct= productRepository.findById(1);
		if(optionalProduct.isPresent()) {
			Product product=optionalProduct.get();
			System.out.println(product);
			product.setPrice(10000);
			productRepository.save(product);
		}else {
			System.out.println("Not able to update");

		}
	}
	
	@Test
	void readAllProducts() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
	List<Product> products=(List<Product>) productRepository.findAll();
	System.out.println(products);

	}
	@Test
	void readAllProductsByName() {
		ProductRepository productRepository=context.getBean(ProductRepository.class);
	List<Product> products=(List<Product>) productRepository.findByName("laptop");
	System.out.println(products);

	}
}
