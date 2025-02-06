package com.sridhar.patterns.proxy;

public class StockExchange implements CDSL {
	

	@Override
	public void buyStock(String stockName) {
		System.out.println("Purchased the stock "+ stockName+" from Stock exchange");

	}

	@Override
	public void sellStock(String stockName) {
		System.out.println("Sold the stock "+ stockName+ " to Stock exchange");

	}

}
