package com.rra.base.jpa.repositories.neo4j;

import java.util.List;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.rra.base.jpa.entity.node.Nation;

import reactor.core.publisher.Mono;

public interface NationRepository extends ReactiveNeo4jRepository<Nation, Long> {

	/*
	 * @Query("match(nation) where nation.name=$name return " +
	 * "nation.name as name," + "nation.currency as currency, " +
	 * "nation.population as population, " + "nation.capital as capital ")
	 */
	
	@Query("match(nation) where nation.name=$name return nation")
	Mono<Nation> findByName(@Param("name") String name);

}
