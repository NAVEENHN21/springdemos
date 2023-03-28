package com.examples.InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDaoMySQLImpl implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Open Connection to MySQL DB");
		System.out.println("Run insert statement on MySQL DB");
		System.out.println("Order created in MySQL DB");

	}

}
