package com.cg.bookstore.customException;

import org.springframework.stereotype.Component;


public class ServiceException extends RuntimeException{

	public ServiceException(String message) {
		super(message);
	}
}