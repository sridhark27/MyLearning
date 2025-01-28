package com.sridhar.patterns.facade.impl;

import java.util.Arrays;
import java.util.List;

import com.sridhar.patterns.facade.inf.Cinemas;

public class CinepolisCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Avenger End game","Frozen 2","Deadpool-2");

	@Override
	public List<String> getMovies() {
		return list;
	}

}
