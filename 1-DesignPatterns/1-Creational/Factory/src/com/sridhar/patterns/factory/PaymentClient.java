package com.sridhar.patterns.factory;

public class PaymentClient {
	
	private UPI upi;
	
	public PaymentClient(UPIFactory upiFactory) {
		upi = upiFactory.createObject();
	}

	public UPI getUpi() {
		return upi;
	}

}
