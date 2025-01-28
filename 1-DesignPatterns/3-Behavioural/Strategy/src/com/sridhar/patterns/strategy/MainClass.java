package com.sridhar.patterns.strategy;

public class MainClass {

	public static void main(String[] args) {
		
		CurrencyCalculator currencyCalculator = new CurrencyCalculator(new EmiratiDirham());
		currencyCalculator.doCalculate(15D);
		
		currencyCalculator = new CurrencyCalculator(new UnitedStatesDollar());
		currencyCalculator.doCalculate(15D);
		
		currencyCalculator = new CurrencyCalculator(new UnitedKingdomPounds());
		currencyCalculator.doCalculate(15D);

	}

}
