package com.wiu.montyhall.service;
import java.util.concurrent.ThreadLocalRandom;

import com.wiu.montyhall.exception.InvalidDoorException;

public class MontyHall {

	private long rightDoor;
	private long pickedDoor;
	private byte maxDoor;
	
	public MontyHall() {
		this((byte)3);
	}
	
	public MontyHall(byte maxDoor) {
		this.maxDoor = maxDoor;
	}
	
	public void shuffle() {
		rightDoor = ThreadLocalRandom.current().nextLong(maxDoor);	
	}

	public void setPickedDoor(long pickedDoor) throws InvalidDoorException {
		if(pickedDoor >= maxDoor || pickedDoor < 0) throw new InvalidDoorException(pickedDoor);
		this.pickedDoor = pickedDoor;
	}
	
	public long getPickedDoor() {
		return pickedDoor;
	}


	public void switchDoor() throws Exception {
		pickedDoor = rightDoor == pickedDoor ? -1 : rightDoor;
	}

	public boolean isWinningDoor() {
		return rightDoor == pickedDoor;
	}

	@Override
	public String toString() {
		return "MontyHall [rightDoor=" + rightDoor + ", pickedDoor=" + pickedDoor
				+ ", maxDoor=" + maxDoor +  "]";
	}
	

}
