package com.cendoAiAgentAnalysis.backend.repository;

import com.cendoAiAgentAnalysis.backend.model.ConversationNode; //Import the testnode class
import org.springframework.data.neo4j.repository.Neo4jRepository; //Imports the built in reposetory functions(database function, save(), findAll())


public interface ConversationNodeRepository extends Neo4jRepository<ConversationNode, String> {
}