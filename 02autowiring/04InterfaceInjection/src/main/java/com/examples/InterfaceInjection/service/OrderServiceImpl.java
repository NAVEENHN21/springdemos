package com.examples.InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.InterfaceInjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImpl implements Orderservice{
	
	@Autowired
	@Qualifier("orderdaooracle")
	private OrderDAO orderdao;

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Perform business logic");
		System.out.println("Ready to create order");
		orderdao.createOrder();
	}

}
