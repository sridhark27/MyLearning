package com.sridhar.patterns.factory;

public class BHIMFactory implements UPIFactory {

	@Override
	public UPI createObject() {
		// TODO Auto-generated method stub
		return new BHIM();
	}

}
