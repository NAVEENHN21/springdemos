package com.examples.springORMdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.springORMdemo.dao.ProductDao;
import com.examples.springORMdemo.entity.Product;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springORMdemo\\springconfig.xml");

    	ProductDao productdao=(ProductDao) ctx.getBean("productdao");
    	
    	Product product=new Product();
    	product.setId(1);
    	product.setName("Computer");
    	product.setDescription("Desktop computer");
    	product.setPrice(5000.2);
    	
    	int result=productdao.create(product);
    	System.out.println("Product created: "+result);
    	
     }
}
