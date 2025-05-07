package com.spring.add_ons.learning_carnival.controller;

import com.spring.add_ons.learning_carnival.service.GroqAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groq")
public class GroqAIController {

    @Autowired
    private GroqAIService groqAIService;

    @PostMapping("/chat")
    public String chatCompletion(@RequestBody String userMessage) {
        return groqAIService.generateChatCompletion(userMessage);
    }
}
