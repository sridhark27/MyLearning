package com.sridhar.patterns.facade;

import java.util.ArrayList;
import java.util.List;

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
