package com.examples.InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDaoOracleiml implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Open Connection to Oracle DB");
		System.out.println("Run insert statement on Oracle DB");
		System.out.println("Order created in Oracle DB");

	}	
}
