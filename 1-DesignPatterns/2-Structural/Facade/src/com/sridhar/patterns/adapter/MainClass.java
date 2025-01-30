package com.sridhar.patterns.adapter;

public class MainClass {

	public static void main(String[] args) {
		ReadFile read = new ReadFile(new ReadXmlAdapter());
		read.readFile();
		
		//read = new ReadFile(new ReadJsonAdapter());
		//read.readFile();

	}

}
