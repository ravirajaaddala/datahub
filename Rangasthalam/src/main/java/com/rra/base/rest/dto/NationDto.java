package com.rra.base.rest.dto;

public class NationDto {

	private String name;
	private String currency;
	private String countrycode;
	private String population;
	private String capital;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countryCode) {
		this.countrycode = countryCode;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}
