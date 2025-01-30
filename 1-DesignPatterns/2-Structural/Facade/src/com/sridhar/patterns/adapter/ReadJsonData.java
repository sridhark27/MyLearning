package com.sridhar.patterns.adapter;

import com.sridhar.patterns.adapter.inf.ReadJson;

public class ReadJsonData implements ReadJson {

	@Override
	public void readJsonContent() {
		System.out.println("Read Json content");
		
	}

}
