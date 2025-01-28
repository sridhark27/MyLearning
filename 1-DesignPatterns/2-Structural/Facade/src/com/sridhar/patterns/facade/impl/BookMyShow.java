package com.sridhar.patterns.facade.impl;

import java.util.ArrayList;
import java.util.List;

import com.sridhar.patterns.facade.inf.CinemasViewer;

public class BookMyShow implements CinemasViewer {

	@Override
	public List<List<String>> getAllMovies() {
		
		List<List<String>> list = new ArrayList<>();
		
	
		list.add(new CinepolisCinemas().getMovies() );
		list.add(new InoxCinemas().getMovies());
		list.add(new PvrCinemas().getMovies());
		
		return list;
	}

}
