package com.examples.SpringMVCORMdemo.service;

import java.util.List;

import com.examples.SpringMVCORMdemo.exception.UserAlreadyExistsException;
import com.examples.springORMdemo.entity.User;

public interface UserService {

	int save(User user) throws UserAlreadyExistsException;
	
	List<User> getUsers();
}
