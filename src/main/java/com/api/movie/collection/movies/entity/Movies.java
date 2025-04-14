package com.api.movie.collection.movies.entity;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	
	@Nonnull
	private String imdbId;
	
	@Nonnull
	private String title;
	
	private String overview;
	
	private String productionCompanies;
	
	private String releaseDate;
	
	private String genres;
	
	private Integer budget;
	
	private Integer revenue;
	
	private float runtime;
	
	private String language;
	
	private String status;
	
	public Movies() {}

	public Movies(Long movieId, String imdbId, String title, String overview, String productionCompanies,
			String releaseDate, String genres, Integer budget, Integer revenue, float runtime, String language,
			String status) {
		super();
		this.movieId = movieId;
		this.imdbId = imdbId;
		this.title = title;
		this.overview = overview;
		this.productionCompanies = productionCompanies;
		this.releaseDate = releaseDate;
		this.genres = genres;
		this.budget = budget;
		this.revenue = revenue;
		this.runtime = runtime;
		this.language = language;
		this.status = status;
	}
	
	
	/**
	 * @return the movieId
	 */
	public Long getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
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
	 * @return the overview
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * @param overview the overview to set
	 */
	public void setOverview(String overview) {
		this.overview = overview;
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
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(String releaseDate) {
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
	public Integer getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(Integer budget) {
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", imdbId=" + imdbId + ", title=" + title + ", overview=" + overview
				+ ", productionCompanies=" + productionCompanies + ", releaseDate=" + releaseDate + ", genres=" + genres
				+ ", budget=" + budget + ", revenue=" + revenue + ", runtime=" + runtime + ", language="
				+ language + ", status=" + status + "]";
	}
	
}
