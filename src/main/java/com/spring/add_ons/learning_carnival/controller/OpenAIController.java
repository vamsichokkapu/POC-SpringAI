package com.spring.add_ons.learning_carnival.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/openai")

public class OpenAIController {


    @Autowired
    ChatClient chatClient;
//    @PostMapping("/generate")
//    public String generateText(@RequestBody String prompt) {
//        return prompt;
//        //return openAIService.generateText(prompt);
//    }

    @GetMapping("/chat")
    public String getReponse(@RequestParam String prompt) {
        try {
            return chatClient.prompt(prompt).call().content();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
