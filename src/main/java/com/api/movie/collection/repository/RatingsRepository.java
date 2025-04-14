package com.api.movie.collection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.movie.collection.entity.Ratings;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Long>{
	
	Ratings findByMovieId(Long movieId);

}
