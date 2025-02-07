package com.sridhar.patterns.observer;

public interface GoldPriceMarket {
	
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyAllObservers();

}
