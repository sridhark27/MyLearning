package com.sridhar.patterns.builder;

public class Mobile  {
	
	private float weight;
	private float displaySize;
	private String operatingSystem;
	private int memory;
	private float primaryCamera;
	private float secondaryCamera;
	private String brand;
	
	public Mobile() {
		super();
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void setPrimaryCamera(float primaryCamera) {
		this.primaryCamera = primaryCamera;
	}

	public void setSecondaryCamera(float secondaryCamera) {
		this.secondaryCamera = secondaryCamera;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", operatingSystem=" + operatingSystem + ", weight=" + weight
				+ ", displaySize=" + displaySize + ", memory=" + memory + ", primaryCamera=" + primaryCamera
				+ ", secondaryCamera=" + secondaryCamera + "]";
	}


	
	
	

}
