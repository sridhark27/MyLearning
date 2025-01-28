package com.sridhar.patterns.facade;

import java.util.Arrays;
import java.util.List;

public class PvrCinemas implements Cinemas {
	
	public static final List<String> list = Arrays.asList("Batman","Lion King");

	@Override
	public List getMovies() {
		return list;
	}

}
