package com.cg.bookstore.customException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
//import net.javaguides.springboot.exception;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler{
	
	  @ExceptionHandler(value = { ServiceException.class})
	  public ResponseEntity<Object> handleBookException(ServiceException ex, WebRequest request)
	  {
	      String bodyOfResponse = ex.getLocalizedMessage();
		  return new ResponseEntity(bodyOfResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	   }

//	  @ExceptionHandler(MethodArgumentNotValidException.class)
//	  public ResponseEntity<?> customValidationErrorHandling(MethodArgumentNotValidException exception){
//		 ErrorDet
//	  }
//	  
	}