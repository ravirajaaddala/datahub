package com.rra.base.rest.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rra.base.jpa.entity.node.Nation;
import com.rra.base.jpa.repositories.neo4j.NationRepository;
import com.rra.base.rest.dto.NationDto;

import reactor.core.publisher.Mono;

@Service
public class NationRepositoryService {


	@Autowired
	private NationRepository nationRepository;

	public NationDto findByName(String name) {
		Mono<Nation> mn = this.nationRepository.findByName(name);
		Nation n = mn.block();
		System.out.println("nation is " + n);
		NationDto dto = new NationDto();
		dto.setName(n.getName());
		dto.setCapital(n.getCapital());
		dto.setCountrycode(n.getCountrycode());
		dto.setCurrency(n.getCurrency());
		dto.setPopulation(n.getPopulation());

		return dto;
	}

	

}
