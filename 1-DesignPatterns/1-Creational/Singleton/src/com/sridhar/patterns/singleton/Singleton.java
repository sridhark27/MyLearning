package com.sridhar.patterns.singleton;

public class Singleton {
	
	private static volatile Singleton singletonInstance=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance()
	{
	    if (singletonInstance == null) {
	    	
	    	synchronized (Singleton.class) {
	    		if(singletonInstance == null) 
	    			singletonInstance = new Singleton();
	    		
	    	}
	    }
	    return singletonInstance;
	}

}
