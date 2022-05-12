package com.cg.exception;

public class DealerIdNotFoundException extends RuntimeException{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DealerIdNotFoundException(String message) {
        super(message);
    }
    public DealerIdNotFoundException() {
    }
}

