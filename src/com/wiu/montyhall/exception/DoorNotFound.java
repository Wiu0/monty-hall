package com.wiu.montyhall.exception;

public class DoorNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DoorNotFound(long doorId) {
		super("Door not found " + doorId);
	}
}
