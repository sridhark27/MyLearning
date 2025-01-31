package com.sridhar.patterns.factory;

public class GPay implements UPI {

	@Override
	public void transfer() {
		System.out.println("Gpay payment gateway");

	}

}
