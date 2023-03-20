package com.wiu.montyhall;

import com.wiu.montyhall.view.ViewHall;
import com.wiu.montyhall.view.impl.MainGraphView;
import com.wiu.montyhall.view.impl.MainTerminalView;

public class Application {

	public static void main(String[] args) {
//		args = new String[] {""};
		ViewHall view = args.length > 0 ? new MainTerminalView() : new MainGraphView();
		
		view.title();
		view.menuOptionInitialize();
	}
}
