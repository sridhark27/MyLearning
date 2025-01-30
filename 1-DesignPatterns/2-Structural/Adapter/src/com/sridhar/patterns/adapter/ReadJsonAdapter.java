package com.sridhar.patterns.adapter;

import com.sridhar.patterns.adapter.inf.ReadJson;

public class ReadJsonAdapter implements ReadJson {
	
	ReadJsonData readJsonData;
	
	public ReadJsonAdapter() {
		readJsonData = new ReadJsonData();
	}

	@Override
	public void readJsonContent() {
		readJsonData.readJsonContent();
		
	}

}
