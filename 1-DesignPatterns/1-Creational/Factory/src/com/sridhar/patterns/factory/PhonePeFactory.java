package com.sridhar.patterns.factory;

public class PhonePeFactory implements UPIFactory {

	@Override
	public UPI createObject() {
		return new PhonePe();
	}

}
