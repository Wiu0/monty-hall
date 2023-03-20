package com.wiu.montyhall.exception;

public class InvalidDoorException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidDoorException(long doorId) {
		super("Door invalid" + doorId);
	}
}
