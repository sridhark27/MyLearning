package com.sridhar.patterns.strategy;

public class CurrencyCalculator {
	
	private CurrencyConvertor currencyConvertor;

	public CurrencyCalculator() {
		super();
	}

	public CurrencyCalculator(CurrencyConvertor currencyConvertor) {
		super();
		this.currencyConvertor = currencyConvertor;
	}

	public CurrencyConvertor getCurrencyConvertor() {
		return currencyConvertor;
	}

	public void setCurrencyConvertor(CurrencyConvertor currencyConvertor) {
		this.currencyConvertor = currencyConvertor;
	}
	
	public double doCalculate(Double currency) {
		return currencyConvertor.exchangeCurrency(currency);
	}

}
