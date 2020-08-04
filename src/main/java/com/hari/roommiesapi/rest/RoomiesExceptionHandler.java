package com.hari.roommiesapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RoomiesExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(Exception exc){
		
		UserErrorResponse userErrorResponse = new UserErrorResponse();
		userErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		userErrorResponse.setMessage(exc.getMessage());
		userErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<>(userErrorResponse, HttpStatus.BAD_REQUEST);
		
	}
	
	
}
