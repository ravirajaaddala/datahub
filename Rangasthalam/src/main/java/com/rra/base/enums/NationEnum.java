package com.rra.base.enums;

import java.util.Arrays;


public enum NationEnum {


	INDIA(1, "India","+91"),
	UNKNOWN(9999, "unknown","unknown");

	private String name;
	private int id;
	private String countryCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	NationEnum(int id, String name, String countryCode) {
		this.name = name;
		this.id = id;
		this.countryCode= countryCode;
	}

	public NationEnum get(String name) {
		NationEnum types[] = NationEnum.values();
		return Arrays.stream(types).filter(type -> type.getName().equals(name)).findFirst().orElse(NationEnum.UNKNOWN);
	}

	public static NationEnum get(int id) {
		NationEnum types[] = NationEnum.values();
		return Arrays.stream(types).filter(type -> (type.getId() == (id))).findFirst().orElse(NationEnum.UNKNOWN);
	}

}
