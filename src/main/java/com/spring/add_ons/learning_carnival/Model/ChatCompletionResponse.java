package com.spring.add_ons.learning_carnival.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatCompletionResponse {

    @JsonProperty("choices")
    private Choice[] choices;

    public static class Choice {
        @JsonProperty("message")
        private ChatCompletionRequest.Message message;

        public ChatCompletionRequest.Message getMessage() {
            return message;
        }

        public void setMessage(ChatCompletionRequest.Message message) {
            this.message = message;
        }
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }
}
