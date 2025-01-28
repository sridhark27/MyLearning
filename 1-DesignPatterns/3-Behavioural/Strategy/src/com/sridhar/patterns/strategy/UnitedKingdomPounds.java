package com.sridhar.patterns.strategy;

public class UnitedKingdomPounds implements CurrencyConvertor {
	
	private static final double GBP= 103.15D;
	private double currency;

	@Override
	public double exchangeCurrency(double currency) {
		this.currency = currency * GBP;
		System.out.println("GBP to INR "+this.currency);
		return this.currency; 
	}

}
