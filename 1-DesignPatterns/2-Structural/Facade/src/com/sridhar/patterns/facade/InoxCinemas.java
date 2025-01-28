package com.sridhar.patterns.facade;

import java.util.Arrays;
import java.util.List;

public class InoxCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Jurassic park-3","Mission Impossible 8","Avatar");

	@Override
	public List getMovies() {
		return list;
	}

}
