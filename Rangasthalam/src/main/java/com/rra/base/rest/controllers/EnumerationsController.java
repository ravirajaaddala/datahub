package com.rra.base.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rra.base.enums.AvailableEnumerationsEnum;
import com.rra.base.rest.dto.NationDto;
import com.rra.base.rest.services.NationRepositoryService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/data")
public class EnumerationsController {

	@Autowired
	private NationRepositoryService nationRepositoryService;

	@GetMapping("/category/{x}")
	@ResponseBody
	public NationDto get(@PathVariable("x") String urlParameter) {
		System.out.println("looking for = " + urlParameter);
		return nationRepositoryService.findByName(urlParameter);

	}

	@GetMapping("/categories")
	@ResponseBody
	public List<String> getAvailableData() {
		List<AvailableEnumerationsEnum> ad = AvailableEnumerationsEnum.getAll();
		List<String> availableData = new ArrayList<String>();
		for (AvailableEnumerationsEnum aee : ad) {
			availableData.add(aee.getName());
		}
		return availableData;
	}

}
