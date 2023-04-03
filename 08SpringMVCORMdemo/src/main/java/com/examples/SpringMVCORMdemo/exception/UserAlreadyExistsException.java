package com.examples.SpringMVCORMdemo.exception;

public class UserAlreadyExistsException extends Exception {

	public UserAlreadyExistsException(String email) {
		super("User already exists: "+email);
	}
}
