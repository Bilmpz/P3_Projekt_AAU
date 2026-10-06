package com.cendoAiAgentAnalysis.backend.model;

import org.springframework.data.neo4j.core.schema.Id; //Imports the id annotation from spring data Neo4j. Id is the identifier of the nodes
import org.springframework.data.neo4j.core.schema.Node; //Node annotation. Spring dataNeo4j knows this java class represents a Neo4j node

@Node("CustomerNode")
public class CustomerNode {
    @Id
    private String id;
    private String name;

    public CustomerNode() {
    }

    public CustomerNode(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}