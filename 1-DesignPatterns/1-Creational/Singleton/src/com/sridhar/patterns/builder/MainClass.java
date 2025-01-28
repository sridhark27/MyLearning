package com.sridhar.patterns.builder;

public class MainClass {

	public static void main(String[] args) {
		
		Mobile hmd = new MobileAssemble()
				.setBrandName("HMD")
				.setDisplayScreen(3.2F)
				.addPrimaryCameraSensor(5.5F)
				.addMemory(2)
				.assemble();
		System.out.println(hmd);
		
		Mobile googlePixel = new MobileAssemble()
				.setBrandName("Google Pixel")
				.setDisplayScreen(6.5F)
				.addPrimaryCameraSensor(42.5F)
				.addMemory(64)
				.addSecondaryCameraSensor(10.3F)
				.setWeight(205.23F)
				.installOperatingSystem("Android v15")
				.assemble();
		System.out.println(googlePixel);

	}

}
