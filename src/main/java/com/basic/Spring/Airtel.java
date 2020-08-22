package com.basic.Spring;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel Constructor Loaded!");
	}
	
	public void calling() {
		System.out.println("Calling using Airtel Sim");
		
	}

	public void data() {
		System.out.println("Using data from Airtel Sim");
	}
		
}
