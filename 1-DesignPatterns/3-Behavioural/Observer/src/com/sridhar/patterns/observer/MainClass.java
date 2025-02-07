package com.sridhar.patterns.observer;

public class MainClass {

	public static void main(String[] args) {
		IBJA ibja = new IBJA();
		
		Observer grt = new GrtObserver();
		Observer tanishq = new TanishqObserver();
		
		ibja.addObserver(tanishq);
		ibja.addObserver(grt);
		
		ibja.setGoldPrice(6598.35F);

	}

}
