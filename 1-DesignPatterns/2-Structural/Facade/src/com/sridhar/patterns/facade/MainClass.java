package com.sridhar.patterns.facade;

import com.sridhar.patterns.facade.impl.BookMyShow;

public class MainClass {
	
	public static void main(String[] args) {
		BookMyShow b = new BookMyShow();
		b.getAllMovies().forEach(System.out::println);
	}

}
