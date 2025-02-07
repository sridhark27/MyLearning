package com.sridhar.patterns.state;

public class GreenSignal implements TrafficSignal {

	@Override
	public void action() {
		System.out.println("Green Signal");

	}

}
