package com.rra.base.enums;

import java.util.Arrays;

public enum ArtistRelationshipEnum {

	FATHER(1, "Father"), MOTHER(2, "Mother"), BROTHER(3, "Brother"), SISTER(4, "Sister"), SON(5, "Son"),
	DAUGHTER(6, "Daughter"), GRAND_FATHER(7, "Grand father"), GRAND_MOTHER(8, "Grand mother"), COUSIN(9, "Cousin"),
	FRIEND(10, "Friend"), COLLEAGUE(11, "Colleague"), UNKNOWN(9999, "unknown");

	private String name;
	private int id;

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

	ArtistRelationshipEnum(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public ArtistRelationshipEnum get(String name) {
		ArtistRelationshipEnum types[] = ArtistRelationshipEnum.values();
		return Arrays.stream(types).filter(type -> type.getName().equals(name)).findFirst()
				.orElse(ArtistRelationshipEnum.UNKNOWN);
	}

	public static ArtistRelationshipEnum get(int id) {
		ArtistRelationshipEnum types[] = ArtistRelationshipEnum.values();
		return Arrays.stream(types).filter(type -> (type.getId() == (id))).findFirst()
				.orElse(ArtistRelationshipEnum.UNKNOWN);
	}
}
