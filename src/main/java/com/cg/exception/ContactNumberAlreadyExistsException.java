package com.cg.exception;

public class ContactNumberAlreadyExistsException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public ContactNumberAlreadyExistsException(String message) {
        super(message);
        
    }
    public ContactNumberAlreadyExistsException() {
    }
}