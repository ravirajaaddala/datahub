package com.rra.base.jpa.entity.node;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;


@Node("nation")
public class Nation {

	@Id
	@GeneratedValue
	private Long identity;
	@Property("name")
	private String name;
	@Property("currency")
	private String currency;
	@Property("countrycode")
	private String countrycode;
	@Property("population")
	private String population;
	@Property("capital")
	private String capital;
	
	

	public Long getIdentity() {
		return identity;
	}
	public String getName() {
		return name;
	}
	public String getCurrency() {
		return currency;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public String getPopulation() {
		return population;
	}
	public String getCapital() {
		return capital;
	}

	
}
