package com.spring.add_ons.learning_carnival.service;
import com.spring.add_ons.learning_carnival.Model.ChatCompletionRequest;
import com.spring.add_ons.learning_carnival.Model.ChatCompletionResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class GroqAIService {

    @Value("${groq.api.key}")
    private String apiKey;

    @Value("${groq.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateChatCompletion(String userMessage) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        ChatCompletionRequest.Message message = new ChatCompletionRequest.Message("user", userMessage);
        ChatCompletionRequest request = new ChatCompletionRequest("llama3-8b-8192", Collections.singletonList(message));

        HttpEntity<ChatCompletionRequest> entity = new HttpEntity<>(request, headers);

        ResponseEntity<ChatCompletionResponse> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, ChatCompletionResponse.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody().getChoices()[0].getMessage().getContent();
        } else {
            throw new RuntimeException("Failed to connect to Groq AI API");
        }
    }
}
