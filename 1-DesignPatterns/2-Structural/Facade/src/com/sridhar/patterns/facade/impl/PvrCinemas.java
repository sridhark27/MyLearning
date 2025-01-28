package com.sridhar.patterns.facade.impl;

import java.util.Arrays;
import java.util.List;

import com.sridhar.patterns.facade.inf.Cinemas;

public class PvrCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Batman","Lion King");

	@Override
	public List<String> getMovies() {
		return list;
	}

}
