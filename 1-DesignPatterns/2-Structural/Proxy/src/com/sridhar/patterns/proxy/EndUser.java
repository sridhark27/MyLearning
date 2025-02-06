package com.sridhar.patterns.proxy;

public class EndUser {

	public static void main(String[] args) {
		CDSL user;
		
		user = new StockBroker();
		
		user.buyStock("HDFC BANK");
		
		user.sellStock("SBI BANK");

	}

}
