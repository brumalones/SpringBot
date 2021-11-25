package br.betternow.chatbot.dough.validation;

import java.time.LocalDateTime;

public class GenericHandler {
    private final String field;
    private final String error;
    private final LocalDateTime dateTime = LocalDateTime.now();

    public GenericHandler(String field, String error) {
        this.field = field;
        this.error = error;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getField() {
        return field;
    }

    public String getError() {
        return error;
    }
}
