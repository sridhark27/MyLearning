package com.sridhar.patterns.factory;

public class GpayFactory implements UPIFactory {

	@Override
	public UPI createObject() {
		// TODO Auto-generated method stub
		return new GPay();
	}

}
