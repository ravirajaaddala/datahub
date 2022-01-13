package com.rra.base.rest.services;

import org.springframework.stereotype.Service;

import com.rra.base.rest.dto.ArtistDto;

@Service
public class ArtistService {

	public ArtistDto findByName(String name) {
		System.out.println("findByName is " + name);
		ArtistDto dto = new ArtistDto();


		return dto;
	}
}
