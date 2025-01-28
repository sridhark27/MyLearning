package com.sridhar.patterns.facade;

import java.util.Arrays;
import java.util.List;

public class CinepolisCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Avenger End game","Frozen 2","Deadpool-2");

	@Override
	public List getMovies() {
		return list;
	}

}
