package com.api.movie.collection.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.movie.collection.DTO.MoviesDTO;
import com.api.movie.collection.DTO.MoviesDetail;
import com.api.movie.collection.movies.entity.Movies;
import com.api.movie.collection.service.MovieCollectionService;

@RestController
@RequestMapping("/api/movies")
public class MoviesCollectionController {
	
	@Autowired
	private MovieCollectionService service;
	
	Logger logger = LoggerFactory.getLogger(MoviesCollectionController.class);
	
	@GetMapping("/all")
	public ResponseEntity<List<MoviesDTO>> getAllMovies(@RequestParam int offset, 
			@RequestParam int pageSize) {
		List<MoviesDTO> moviesDTOList = new ArrayList<>();
		try {
			moviesDTOList = service.getAllMovies(offset, pageSize);
		} catch (ParseException e) {
			logger.error("Error find all movies: " + e.getMessage());
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(moviesDTOList);
	}
	
	@GetMapping("/details/{movieId}")
	public ResponseEntity<MoviesDetail> getMovieDetails(@PathVariable Long movieId) {
		MoviesDetail movieDetail = new MoviesDetail();
		try {
			movieDetail = service.getMovieDetails(movieId);
		} catch (ParseException e) {
			logger.error("Error get movie details : " + e.getMessage());
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(movieDetail);
	}
	
	@GetMapping("/all/{field}/{sort}")
	public ResponseEntity<List<MoviesDTO>> getAllMoviesByFields(@RequestParam int offset, 
			@RequestParam int pageSize, @PathVariable String field, @PathVariable String sort ) {
		List<MoviesDTO> moviesDTOList = new ArrayList<>();
		try {
			moviesDTOList = service.getAllMoviesByFields(offset, pageSize, field, sort);
		} catch (ParseException e) {
			logger.error("Error find all movies with field and sorting: " + e.getMessage());
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(moviesDTOList);
	}
	
}
