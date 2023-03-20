package com.wiu.montyhall.view.impl;

import java.util.List;

import javax.swing.JOptionPane;

import com.wiu.montyhall.enums.Menu;
import com.wiu.montyhall.view.ViewHall;

public class MainGraphView implements ViewHall {

	@Override
	public void title() {
		JOptionPane.showMessageDialog(null,TITLE);
		
	}

	@Override
	public void menuOptionInitialize() {
		Object[] values = List.of(Menu.values()).stream().map(t -> t.sentence).toArray();

		Object selected = JOptionPane.showInputDialog(null, "Menu", "Selection", JOptionPane.DEFAULT_OPTION, null, values, "0");
		if ( selected != null ){//null if the user cancels. 
		    //do something
		}else{
		    JOptionPane.showMessageDialog(null,  "User cancelled");
		}
		
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
		
	}

	@Override
	public void youLose() {
		// TODO Auto-generated method stub
		
	}	
	
}


