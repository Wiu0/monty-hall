package com.wiu.montyhall.view;

public interface ViewHall {

	static final String TITLE = "WELCOM TO MONTY HALL GAME";
	
	void title();
	void menuOptionInitialize();
	void menuOptionDefineHowManyDoor();
	void menuOptionQuit();
	void whichDoor(long door);
	void keepDoor(boolean keep);
	void showWrongDoors(long doors[]);
	void youWin();
	void youLose();
	
}
