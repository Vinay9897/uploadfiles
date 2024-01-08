package com.upload;

import org.springframework.web.bind.annotation.ControllerAdvice;

//@ControllerAdvice
public class StorageException extends RuntimeException {
	
//	public StorageException() {
//		
//	}
	
	public StorageException(String message) {
		super(message);
	}
	
	public StorageException(String message , Throwable cause)
	{
		super(message, cause);
	}

}
