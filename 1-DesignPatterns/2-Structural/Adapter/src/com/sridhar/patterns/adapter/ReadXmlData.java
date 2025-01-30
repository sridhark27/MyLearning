package com.sridhar.patterns.adapter;

import com.sridhar.patterns.adapter.inf.ReadXml;

public class ReadXmlData implements ReadXml {

	@Override
	public void readXmlContent() {
		System.out.println("Read XML content");

	}

}
