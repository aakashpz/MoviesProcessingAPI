package com.api.movie.collection.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "ratings")
public class Ratings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ratingId;
	
	@Nonnull
	private Integer userId;
	
	@Nonnull
	private Integer movieId;
	
	@Nonnull
	private float rating;
	
	@Nonnull
	private Integer timestamp;

	public Ratings() {}

	public Ratings(Long ratingId, Integer userId, Integer movieId, float rating, Integer timestamp) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.timestamp = timestamp;
	}

	
	/**
	 * @return the ratingId
	 */
	public Long getRatingId() {
		return ratingId;
	}

	/**
	 * @param ratingId the ratingId to set
	 */
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the movieId
	 */
	public Integer getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the Rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * @param Rating the Rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}

	/**
	 * @return the timestamp
	 */
	public Integer getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Ratings [ratingId=" + ratingId + ", userId=" + userId + ", movieId=" + movieId + ", rating="
				+ rating + ", timestamp=" + timestamp + "]";
	}
	
	
}
