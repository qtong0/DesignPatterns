package com.patterns.creational;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		System.out.println( "Singleton instance created!" );
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
