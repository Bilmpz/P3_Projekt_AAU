package com.cendoAiAgentAnalysis.backend.model;

import org.springframework.data.neo4j.core.schema.Id; //Imports the id annotation from spring data Neo4j. Id is the identifier of the nodes
import org.springframework.data.neo4j.core.schema.Node; //Node annotation. Spring dataNeo4j knows this java class represents a Neo4j node
import java.util.List;
import java.time.Instant;
import java.time.LocalDateTime;

@Node("ConversationNode")
public class ConversationNode {
    @Id
    private String id;
    private String transcript;
    private String customerId;
    private List<Float> embedding;
    private Instant timestamp;
    private String clusterId;

    public ConversationNode() {
    }

    public ConversationNode( String id, String transcript, String customerId, List<Float> embedding,
            Instant timestamp, String clusterId) {
        this.id = id;
        this.transcript = transcript;
        this.customerId = customerId;
        this.embedding = embedding;
        this.timestamp = timestamp;
        this.clusterId = clusterId;
    }

    public String getId() { return id; }
    public String getTranscript() { return transcript; }
    public String getCustomerId() { return customerId; }
    public List<Float> getEmbedding() { return embedding; }
    public Instant getTimestamp() { return timestamp; }
    public String getClusterId() { return clusterId; }
}

