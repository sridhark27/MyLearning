package com.sridhar.patterns.facade.impl;

import java.util.Arrays;
import java.util.List;

import com.sridhar.patterns.facade.inf.Cinemas;

public class InoxCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Jurassic park-3","Mission Impossible 8","Avatar");

	@Override
	public List<String> getMovies() {
		return list;
	}

}
