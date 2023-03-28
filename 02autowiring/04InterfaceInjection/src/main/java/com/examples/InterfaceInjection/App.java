package com.examples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.InterfaceInjection.dao.OrderDAO;
import com.examples.InterfaceInjection.service.Orderservice;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\InterfaceInjection\\springconfig.xml");
  	  
  		Orderservice  orderservice=(Orderservice) ctx.getBean("orderservice");
  		orderservice.placeOrder();
  		
  		System.out.println("**************************************");
  		
  		OrderDAO orderdao=(OrderDAO) ctx.getBean("orderdaooracle");
  		orderdao.createOrder();
  	    
  		System.out.println("**************************************");

  		OrderDAO orderdao1=(OrderDAO) ctx.getBean("orderdaomysql");
  		orderdao1.createOrder();
    }
}
