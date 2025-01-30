package com.sridhar.patterns.adapter;

import com.sridhar.patterns.adapter.inf.ReadXml;

public class ReadXmlAdapter implements ReadXml {
	
	ReadXmlData readXmlData;
	
	public ReadXmlAdapter() {
		readXmlData = new ReadXmlData();
	}

	@Override
	public void readXmlContent() {
		readXmlData.readXmlContent();

	}
	

}
