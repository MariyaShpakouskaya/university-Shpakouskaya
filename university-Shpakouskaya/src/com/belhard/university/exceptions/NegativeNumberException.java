package com.belhard.university.exceptions;

@SuppressWarnings("serial")
public class NegativeNumberException extends RuntimeException {

	public NegativeNumberException() {
	}

	public NegativeNumberException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "NegativeNumberException { " + getMessage() + " }";
	}

}
