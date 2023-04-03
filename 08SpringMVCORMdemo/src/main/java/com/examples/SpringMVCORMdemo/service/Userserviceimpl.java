package com.examples.SpringMVCORMdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.SpringMVCORMdemo.exception.UserAlreadyExistsException;
import com.examples.springORMdemo.dao.UserDao;
import com.examples.springORMdemo.entity.User;

@Service
public class Userserviceimpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		// TODO Auto-generated method stub
		//Validation
		if(userdao.finduser(user.getEmail())!=null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userdao.findUsers();
	}

}
