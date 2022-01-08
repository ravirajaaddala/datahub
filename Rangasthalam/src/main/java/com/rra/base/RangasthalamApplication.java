package com.rra.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan({"com.rra"}) 
@EnableNeo4jRepositories
public class RangasthalamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RangasthalamApplication.class, args);
	}

}
