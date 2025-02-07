package com.sridhar.patterns.state;

public class MainClass {

	public static void main(String[] args) {
		
		StateContext context = new StateContext();
		context.setSignal(new RedSignl());
		context.action();
		
		context.setSignal(new YellowSignal());
		context.action();
		
		context.setSignal(new GreenSignal());
		context.action();

	}

}
