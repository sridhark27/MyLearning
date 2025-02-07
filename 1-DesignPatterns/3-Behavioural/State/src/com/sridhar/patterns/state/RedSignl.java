package com.sridhar.patterns.state;

public class RedSignl implements TrafficSignal {

	@Override
	public void action() {
		System.out.println("Red signal");
	}

}
