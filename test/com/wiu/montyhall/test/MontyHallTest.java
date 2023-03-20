package com.wiu.montyhall.test;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.wiu.montyhall.service.MontyHall;

public class MontyHallTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		long winning = 0;
		String lineSep = "=======================";
		System.out.println(lineSep);
		System.out.println("Monty Hall Problem");
		System.out.println(lineSep);
		System.out.println("Execution Plan");
		System.out.println("0 - Always switch doors");
		System.out.println("1 - Keep initial door");

		byte switched = sc.nextByte();

		System.out.println("\n" + lineSep);
		System.out.println("How many times should execution plan?");
		long qtt = sc.nextLong();

		MontyHall m = new MontyHall();
		for (int i = 0; i < qtt; i++) {
			System.out.println(lineSep);
			System.out.println("Running Test Plan " + i);
			System.out.println(lineSep);
			m.shuffle();
			System.out.println("Which door? 0, 1 or 2?");
			m.setPickedDoor(ThreadLocalRandom.current().nextInt(3));
			System.out.println("Picked door: " + m.getPickedDoor());
			System.out.println("Open All Wrong doors except one");
			System.out.println("Wanna keep your door?");
			if (switched == 0) {
				m.switchDoor();
			}
			System.out.println(lineSep);
			if (m.isWinningDoor()) {
				System.out.println("YOU WIN");
				winning++;
			} else {
				System.out.println("YOU LOSE");
			}
			System.out.println("OBJECT: " + m);
			System.out.println(lineSep);
		}
		
		System.out.println("\n\nWINNING TIMES: " + winning);
		System.out.println("TOTAL TIMES PLAYED: " + qtt);
		System.out.println("WINNING: " + (winning * 1.0)/qtt * 100 + "%");

		sc.close();

	}

}
