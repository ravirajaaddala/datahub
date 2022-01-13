package com.rra.base.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rra.base.rest.dto.ArtistDto;
import com.rra.base.rest.services.ArtistService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@GetMapping("/details/{x}")
	@ResponseBody
	public ArtistDto getDetailsByName(@PathVariable("x") String name) {
		System.out.println("looking for = " + name);
		return artistService.findByName(name);

	}
	
	@GetMapping("/relations/{x}")
	@ResponseBody
	public List<ArtistDto> getRelations(@PathVariable("x") String name) {
		System.out.println("looking for = " + name);
		return null;

	}
}
