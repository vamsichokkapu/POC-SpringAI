package com.spring.add_ons.learning_carnival.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@Service
public class OpenAIService {
//
//    @Value("${openai.api.key}")
//    private String apiKey;
//
//    @Value("${openai.api.url}")
//    private String apiUrl;
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    public String generateText(String prompt) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setBearerAuth(apiKey);
//
//        String requestBody = String.format("{\"model\":\"gpt-4\",\"prompt\":\"%s\",\"max_tokens\":100}", prompt);
//
//        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
//
//        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl + "/completions", request, String.class);
//
//        if (response.getStatusCode() == HttpStatus.OK) {
//            return response.getBody();
//        } else {
//            throw new RuntimeException("Failed to connect to OpenAI API");
//        }
//    }
}
