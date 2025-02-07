package com.sridhar.patterns.state;

public class RedSignal implements TrafficSignal {

	@Override
	public void action() {
		System.out.println("Red signal");
	}

}
