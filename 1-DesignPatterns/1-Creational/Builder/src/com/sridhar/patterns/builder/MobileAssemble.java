package com.sridhar.patterns.builder;

public class MobileAssemble implements MobileBuilder{
	
	private Mobile mobile;
	
	public MobileAssemble() {
		this.mobile = new Mobile();
	}

	@Override
	public MobileBuilder setDisplayScreen(float screenSize) {
		this.mobile.setDisplaySize(screenSize);
		return this;
	}

	@Override
	public MobileBuilder installOperatingSystem(String osNameVersion) {
		this.mobile.setOperatingSystem(osNameVersion);
		return this;
	}

	@Override
	public MobileBuilder addMemory(int memory) {
		this.mobile.setMemory(memory);
		return this;
	}

	@Override
	public MobileBuilder addPrimaryCameraSensor(float megaPixel) {
		this.mobile.setPrimaryCamera(megaPixel);
		return this;
	}

	@Override
	public MobileBuilder addSecondaryCameraSensor(float megaPixel) {
		this.mobile.setSecondaryCamera(megaPixel);
		return this;
	}
	
	@Override
	public MobileBuilder setBrandName(String brand) {
		this.mobile.setBrand(brand);
		return this;
	}
	
	@Override
	public MobileBuilder setWeight(float weight) {
		this.mobile.setWeight(weight);
		return this;
	}


	@Override
	public Mobile assemble() {
		return mobile;
	}


}
