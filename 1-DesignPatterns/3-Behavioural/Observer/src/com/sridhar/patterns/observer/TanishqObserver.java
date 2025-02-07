package com.sridhar.patterns.observer;

public class TanishqObserver implements Observer {
	
	float goldPrice;

	@Override
	public void refreshGoldPrice(float goldPrice) {
		this.goldPrice = goldPrice;
		viewPrice();
	}

	private void viewPrice() {
		System.out.println("Refreshed gold price in Tanishq "+ this.goldPrice);
		
	}

}
