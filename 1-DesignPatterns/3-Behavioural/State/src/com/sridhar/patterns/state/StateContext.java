package com.sridhar.patterns.state;

public class StateContext {
	
	TrafficSignal signal;

	
	
	public void action() {
		signal.action();
	}



	public void setSignal(TrafficSignal signal) {
		this.signal = signal;
	}
	

}
