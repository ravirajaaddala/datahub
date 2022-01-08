package com.rra.base.rest.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rra.base.enums.AvailableEnumerationsEnum;
import com.rra.base.jpa.entity.node.Nation;
import com.rra.base.jpa.repositories.neo4j.NationRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/data")
public class EnumerationsController {

	@Autowired
	private NationRepository nationRepository;
	
	@GetMapping("/category/{x}")
	@ResponseBody
	public HashMap<String,String> get(@PathVariable("x") String urlParameter) {
		HashMap<String,String> h = new HashMap<String,String>();
		System.out.println("looking for = "+urlParameter);
		Nation n= nationRepository.findByName(urlParameter);
		h.put("currency", n.getCurrency());
		h.put("countryCode", n.getCountrycode());
		return h;
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
