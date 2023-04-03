package com.examples.springORMdemo.dao;

import java.util.List;

import com.examples.springORMdemo.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
	User finduser(String email);
}
