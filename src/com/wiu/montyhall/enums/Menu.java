package com.wiu.montyhall.enums;

public enum Menu {

	PLAY((byte) 1, "Play"),
	MANY_DOORS((byte) 2, "Define how many doors"),
	MORE((byte) 3, "See more about monty hall problem"),
	QUIT((byte) 0,"Quit");
	
	public byte id;
	public String sentence;
	
	Menu(byte id, String sentence) {
		this.id = id;
		this.sentence = sentence;
	}
}
