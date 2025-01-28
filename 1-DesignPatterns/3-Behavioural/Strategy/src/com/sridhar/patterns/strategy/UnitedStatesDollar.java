package com.sridhar.patterns.strategy;

public class UnitedStatesDollar implements CurrencyConvertor {
	
	private static final double USD= 83.15D;
	private double currency;

	@Override
	public double exchangeCurrency(double currency) {
		this.currency = currency * USD;
		System.out.println("USD to INR "+this.currency);
		return this.currency;
	}

}
