package com.sridhar.patterns.proxy;

public class StockBroker implements CDSL {
	
	StockExchange stockExchange;
	String stockName;
	

	@Override
	public void buyStock(String stockName) {
		System.out.println("Hello! This is Stock Broker : purchase service");
		
		//After some business logic, Proxy reach actual class
		stockExchange = new StockExchange();
		stockExchange.buyStock(stockName);
	}

	@Override
	public void sellStock(String stockName) {
		System.out.println("Hello! This is Stock Broker : seller service");
		
		//After some business logic, Proxy reach actual class
		stockExchange = new StockExchange();
		stockExchange.sellStock(stockName);

	}

}
