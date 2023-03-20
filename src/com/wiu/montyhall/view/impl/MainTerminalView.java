package com.wiu.montyhall.view.impl;

import java.util.List;
import java.util.Scanner;

import com.wiu.montyhall.enums.Menu;
import com.wiu.montyhall.view.ViewHall;

public class MainTerminalView implements ViewHall {

	private static final String SEP_LINE = "********************************************************************";
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void title() {
		System.out.println(SEP_LINE);
		System.out.println(TITLE);
		System.out.println(SEP_LINE);
	}

	@Override
	public void menuOptionInitialize() {
		List.of(Menu.values()).forEach(menu -> {
			System.out.println(menu.id + " - " + menu.sentence + "\n");
		});
		
	}

	@Override
	public void menuOptionDefineHowManyDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuOptionQuit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void whichDoor(long door) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keepDoor(boolean keep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showWrongDoors(long[] doors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void youWin() {
		// TODO Auto-generated method stub
		sc.close();
		
	}

	@Override
	public void youLose() {
		// TODO Auto-generated method stub
		sc.close();
	}	
	
}


