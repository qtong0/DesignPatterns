package com.patterns.behavioral.mediator;

public class Consumer extends Thread {
	private Mediator med;
	private int id;
	private static int num = 1;
	public Consumer(Mediator m) {
		med = m;
		id = num++;
	}
	public void run() {
		while(true) {
			System.out.print("c" + id + "-" + med.retrieveMessage() + " ");
		}
	}
}
