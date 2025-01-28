package com.sridhar.patterns.builder;

public interface MobileBuilder {
	
	public MobileBuilder setDisplayScreen(float screenSize);
	public MobileBuilder installOperatingSystem(String osNameVersion);
	public MobileBuilder addMemory(int memory);
	public MobileBuilder addPrimaryCameraSensor(float megaPixel);
	public MobileBuilder addSecondaryCameraSensor(float megaPixel);
	public MobileBuilder setBrandName(String brand);
	public MobileBuilder setWeight(float weight);
	public Mobile assemble();

}
