package com.api.movie.collection.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.movie.collection.DTO.MoviesDTO;
import com.api.movie.collection.DTO.MoviesDetail;
import com.api.movie.collection.entity.Ratings;
import com.api.movie.collection.movies.entity.Movies;
import com.api.movie.collection.movies.repository.MoviesRepository;
import com.api.movie.collection.repository.RatingsRepository;
import com.api.movie.collection.util.MovieCollectionUtils;

import io.micrometer.common.util.StringUtils;

@Service
public class MovieCollectionService {
	
	Logger logger = LoggerFactory.getLogger(MovieCollectionService.class);
	
	@Autowired
	private MoviesRepository movieRepository;
	
	@Autowired
	private RatingsRepository ratingsRepository;
	
	
	public List<MoviesDTO> getAllMovies(int offset, int pageSize) throws ParseException{
		Page<Movies> movies = movieRepository.findAll(PageRequest.of(offset, pageSize));
		List<MoviesDTO> moviesList = MovieCollectionUtils.prepareResponse(movies);
		return moviesList;
	}


	public MoviesDetail getMovieDetails(Long movieId) throws ParseException{
		Optional<Movies> movie = movieRepository.findById(movieId);
		Ratings rating = ratingsRepository.findByMovieId(movieId);
		MoviesDetail movieDetail = MovieCollectionUtils.prepareMovieDetails(movie.get(), rating);
		return movieDetail;
	}


	public List<MoviesDTO> getAllMoviesByFields(int offset, int pageSize, String field, String sort) throws ParseException {
		Page<Movies> movies = null; 
		if(StringUtils.isNotBlank(sort) && sort.equals("ASC")) {
			movies = movieRepository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(Sort.Direction.ASC, field)));
		}else {
			movies = movieRepository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(Sort.Direction.DESC, field)));
		}
		List<MoviesDTO> moviesList = MovieCollectionUtils.prepareResponse(movies);
		return moviesList;
	}

}
