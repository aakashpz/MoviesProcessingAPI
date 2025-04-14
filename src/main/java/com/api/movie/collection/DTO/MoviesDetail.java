package com.api.movie.collection.DTO;

import java.util.Date;

public class MoviesDetail {

	private String imdbId;
	private String title;
	
	private String description;
	
	private String productionCompanies;
	
	private Date releaseDate;
	
	private String genres;
	
	private String budget;
	
	private Integer revenue;
	
	private float runtime;
	
	private String originalLanguage;
	
	private float averageRatings;

	public MoviesDetail() {}
	
	
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the productionCompanies
	 */
	public String getProductionCompanies() {
		return productionCompanies;
	}


	/**
	 * @param productionCompanies the productionCompanies to set
	 */
	public void setProductionCompanies(String productionCompanies) {
		this.productionCompanies = productionCompanies;
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


	/**
	 * @return the revenue
	 */
	public Integer getRevenue() {
		return revenue;
	}


	/**
	 * @param revenue the revenue to set
	 */
	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}


	/**
	 * @return the runtime
	 */
	public float getRuntime() {
		return runtime;
	}


	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(float runtime) {
		this.runtime = runtime;
	}


	/**
	 * @return the originalLanguage
	 */
	public String getOriginalLanguage() {
		return originalLanguage;
	}


	/**
	 * @param originalLanguage the originalLanguage to set
	 */
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}


	/**
	 * @return the averageRatings
	 */
	public float getAverageRatings() {
		return averageRatings;
	}


	/**
	 * @param averageRatings the averageRatings to set
	 */
	public void setAverageRatings(float averageRatings) {
		this.averageRatings = averageRatings;
	}


	@Override
	public String toString() {
		return "MoviesDetail [imdbId=" + imdbId + ", title=" + title + ", description=" + description
				+ ", productionCompanies=" + productionCompanies + ", releaseDate=" + releaseDate + ", genres=" + genres
				+ ", budget=" + budget + ", revenue=" + revenue + ", runtime=" + runtime + ", originalLanguage="
				+ originalLanguage + ", averageRatings=" + averageRatings + "]";
	}
	
	
	
}
