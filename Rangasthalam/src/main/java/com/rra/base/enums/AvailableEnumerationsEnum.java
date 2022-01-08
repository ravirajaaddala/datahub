package com.rra.base.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public enum AvailableEnumerationsEnum {

	NATIONS(1, "nations"),
	FRUITS(2, "fruits"),
	VEGETABLES(3, "vegetables"),
	BIRDS(4, "birds"),
	ANIMALS(5, "animals"),
	UNKNOWN(0, "unknown");

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

	AvailableEnumerationsEnum(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public AvailableEnumerationsEnum get(String name) {
		AvailableEnumerationsEnum types[] = AvailableEnumerationsEnum.values();
		return Arrays.stream(types).filter(type -> type.getName().equals(name)).findFirst()
				.orElse(AvailableEnumerationsEnum.UNKNOWN);
	}

	public static AvailableEnumerationsEnum get(int id) {
		AvailableEnumerationsEnum types[] = AvailableEnumerationsEnum.values();
		return Arrays.stream(types).filter(type -> (type.getId() == (id))).findFirst()
				.orElse(AvailableEnumerationsEnum.UNKNOWN);
	}
	
	public static List<AvailableEnumerationsEnum> getAll() {
		AvailableEnumerationsEnum types[] = AvailableEnumerationsEnum.values();
		List<AvailableEnumerationsEnum> all = new ArrayList<AvailableEnumerationsEnum>(Arrays.stream(types).toList());
		all.remove(UNKNOWN);
		return all;
	}

}
