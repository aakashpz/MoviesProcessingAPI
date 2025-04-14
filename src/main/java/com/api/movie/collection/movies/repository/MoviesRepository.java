package com.api.movie.collection.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.movie.collection.movies.entity.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{
	
}
