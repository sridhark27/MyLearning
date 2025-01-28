package com.sridhar.patterns.strategy;

public class EmiratiDirham implements CurrencyConvertor {
	
	private static final double AED= 23.56D;
	private double currency;

	@Override
	public double exchangeCurrency(double currency) {
		this.currency = currency * AED;
		System.out.println("AED to INR "+this.currency);
		return this.currency; 
	}

}
