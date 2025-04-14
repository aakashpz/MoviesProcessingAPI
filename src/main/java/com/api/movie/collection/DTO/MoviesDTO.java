package com.api.movie.collection.DTO;

import java.beans.JavaBean;
import java.util.Date;

public class MoviesDTO {
	
	private String imdbId;
	
	private String title;
	
	private String genres;
	
	private Date releaseDate;
	
	private String budget;
	
	public MoviesDTO() {}

	public MoviesDTO(int movieId, String imdbId, String title, String genres, Date releaseDate, String budget) {
		super();
		this.imdbId = imdbId;
		this.title = title;
		this.genres = genres;
		this.releaseDate = releaseDate;
		this.budget = budget;
	}

	/**
	 * @return the imdbId
	 */
	public String getImdbId() {
		return imdbId;
	}

	/**
	 * @param imdbId the imdbId to set
	 */
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genres
	 */
	public String getGenres() {
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(String genres) {
		this.genres = genres;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the budget
	 */
	public String getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MoviesDTO [imdbId=" + imdbId + ", title=" + title + ", genres=" + genres
				+ ", releaseDate=" + releaseDate + ", budget=" + budget + "]";
	}
	
	
}
