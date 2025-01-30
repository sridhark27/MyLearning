package com.sridhar.patterns.adapter;

import com.sridhar.patterns.adapter.inf.ReadJson;
import com.sridhar.patterns.adapter.inf.ReadXml;
import com.sridhar.patterns.adapter.inf.ReaderFile;

public class ReadFile implements ReaderFile {
	
	ReadXml readXml;
	ReadJson readJson;
	
	public ReadFile(ReadXml readXml)
    {
        this.readXml = readXml;
    };
    
    public ReadFile(ReadJson readJson)
    {
        this.readJson = readJson;
    };
    

	@Override
	public void readFile() {
		if (readXml instanceof ReadXml)
			readXml.readXmlContent();
		/*if (readJson instanceof ReadJson)
			readJson.readJsonContent();*/
	}

}
