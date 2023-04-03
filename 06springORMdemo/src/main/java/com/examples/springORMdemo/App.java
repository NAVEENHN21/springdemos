package com.examples.springORMdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.springORMdemo.dao.ProductDao;
import com.examples.springORMdemo.entity.Product;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
//    	create();
//    	update();
    	find();
//    	delete();
//    	findAll();

    	
     }

	private static void delete() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
		Product product=new Product();
    	
		product.setId(2);
    	product.setName("Supercomputer");
    	product.setDescription("Desktop computer");
    	product.setPrice(60000.2);
    	
    	productdao.delete(product);
    	System.out.println("Product Deleted");
	}

	private static void findAll() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
    	List<Product> products=productdao.findAll();
    	
    	System.out.println("Product Found: "+products);

    	
	}

	private static void find() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
		Product product=productdao.find(3);
    	System.out.println("Product Found: "+product);

	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
		Product product=new Product();
    	
		product.setId(3);
		product.setName("Monitor");
    	product.setDescription("Monitor");
    	product.setPrice(10000.00);
    	
    	productdao.update(product);
    	System.out.println("Product Updated");
		
	}

	private static void create() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
		Product product=new Product();
    	product.setId(3);
    	product.setName("Monitor");
    	product.setDescription("Monitor");
    	product.setPrice(10000.00);
    	
    	int result=productdao.create(product);
    	System.out.println("Product created: "+result);
		
	}
}
