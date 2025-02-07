package com.sridhar.patterns.state;

public class YellowSignal implements TrafficSignal {

	@Override
	public void action() {
		System.out.println("Yellow Signal");

	}

}
