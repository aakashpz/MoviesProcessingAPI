package com.api.movie.collection.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.api.movie.collection.DTO.MoviesDTO;
import com.api.movie.collection.DTO.MoviesDetail;
import com.api.movie.collection.entity.Ratings;
import com.api.movie.collection.movies.entity.Movies;

import io.micrometer.common.util.StringUtils;

public class MovieCollectionUtils {
	
	/**
	 * 
	 * @param moviesList
	 * @return MoviesDTOList
	 * @throws ParseException 
	 */
	public static List<MoviesDTO> prepareResponse(Page<Movies> moviesList) throws ParseException{
		List<MoviesDTO> moviesDTOList = new ArrayList<>();
		if(moviesList != null 
				&& !moviesList.isEmpty()) {
			for(Movies movie : moviesList) {
				MoviesDTO movieDTO = new MoviesDTO();
				movieDTO.setImdbId(movie.getImdbId());
				movieDTO.setGenres(movie.getGenres());
				movieDTO.setTitle(movie.getTitle());
				movieDTO.setBudget(getBudgetInUSD(movie.getBudget()));
				movieDTO.setReleaseDate(getReleaseDate(movie.getReleaseDate()));
				moviesDTOList.add(movieDTO);
			}
		}
		
		return moviesDTOList;
	}
	
	/**
	 * 
	 * @param budget
	 * @return USD value
	 */
	public static String getBudgetInUSD(Integer budget) {
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		return us.format(budget.doubleValue());
	}
	
	/**
	 * 
	 * @param releaseDate
	 * @return date from string
	 * @throws ParseException
	 */
	
	public static Date getReleaseDate(String releaseDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		if(StringUtils.isNotBlank(releaseDate)) {
			Date date = sdf.parse(releaseDate);
			return date;
		}
		return null;
	}

	public static MoviesDetail prepareMovieDetails(Movies movie, Ratings rating) throws ParseException {
		MoviesDetail movieDetail = new MoviesDetail();
		
		movieDetail.setImdbId(movie.getImdbId());
		movieDetail.setTitle(movie.getTitle());
		movieDetail.setDescription(movie.getOverview());
		movieDetail.setReleaseDate(getReleaseDate(movie.getReleaseDate()));
		movieDetail.setBudget(getBudgetInUSD(movie.getBudget()));
		movieDetail.setRuntime(movie.getRuntime());
		movieDetail.setAverageRatings(rating.getRating());
		movieDetail.setGenres(movie.getGenres());
		movieDetail.setOriginalLanguage(movie.getLanguage());
		movieDetail.setProductionCompanies(movie.getProductionCompanies());
		
		return movieDetail;
	}
}
