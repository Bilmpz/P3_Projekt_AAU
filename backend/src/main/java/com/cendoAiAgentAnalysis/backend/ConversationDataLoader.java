package com.cendoAiAgentAnalysis.backend;

import com.cendoAiAgentAnalysis.backend.model.ConversationNode;
import com.cendoAiAgentAnalysis.backend.repository.ConversationNodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
public class ConversationDataLoader implements CommandLineRunner {

    private final ConversationNodeRepository repository;

    public ConversationDataLoader(ConversationNodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        ConversationNode conversation = new ConversationNode(
                "conversation-1",
                "Customer: Hello, I need help with my order. AI: Of course, how can I help?",
                "customer-1",
                List.of(0.12f, -0.34f, 0.56f),
                Instant.now(),
                "cluster-1"
        );

        repository.save(conversation);

        System.out.println("=================================");
        System.out.println("CONVERSATION CREATED IN NEO4J!");
        System.out.println("=================================");
    }
}