package com.rra.base.jpa.repositories.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.rra.base.jpa.entity.node.Nation;

@Repository
@RepositoryRestResource( collectionResourceRel = "nation")
public interface NationRepository extends Neo4jRepository<Nation, Long> {

	Nation findByName(@Param("name") String name);
}
