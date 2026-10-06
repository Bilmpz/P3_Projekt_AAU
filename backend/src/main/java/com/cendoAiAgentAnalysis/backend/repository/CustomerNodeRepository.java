package com.cendoAiAgentAnalysis.backend.repository;

import com.cendoAiAgentAnalysis.backend.model.CustomerNode; //Import the testnode class
import org.springframework.data.neo4j.repository.Neo4jRepository; //Imports the built in reposetory functions(database function, save(), findAll())

//Overall we tell Spring that we need a reposetory that works with CustemorNode
// CustomerNodeReposetory inherets functionality from Neo4jRepository
//Syntax: Neo4jRepository<Object, the variable type the id is>
//Neo4jRepository<CustomerNode, String> = Create a Neo4j repository for CustomerNodes where their IDs are Strings
public interface CustomerNodeRepository extends Neo4jRepository<CustomerNode, String> {
}