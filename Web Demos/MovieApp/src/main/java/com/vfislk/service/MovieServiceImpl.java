package com.vfislk.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLangauge(String langauge) {

		if(langauge.equals("kannada"))
			return Arrays.asList("KGF","KGF-2","Kottigoba","Love Moctile -2");
		else if(langauge.equals("english"))
			return Arrays.asList("Tom and jerry","The lion king");
		else if(langauge.equals("telugu"))
			return Arrays.asList("telugu-1","telugu-2","telugu-3");
		else if(langauge.equals("urdhu"))
			return Arrays.asList("urdhu-1","urdhu-2","urdhu-3");

		else 
			return Arrays.asList("No movies available");
	}




}
