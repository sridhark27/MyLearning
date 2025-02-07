package com.sridhar.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class IBJA implements GoldPriceMarket {
	
	private List<Observer> observerList = new ArrayList<>();
	float goldPrice;

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifyAllObservers() {
		observerList.forEach(x -> x.refreshGoldPrice(goldPrice));;

	}

	public void setGoldPrice(float goldPrice) {
		this.goldPrice = goldPrice;
		notifyAllObservers();
	}

}
