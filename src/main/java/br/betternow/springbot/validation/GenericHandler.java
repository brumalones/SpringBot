package br.betternow.springbot.validation;
import java.time.LocalDateTime;

public class GenericHandler {
    private String field;
    private String error;
    private LocalDateTime dateTime = LocalDateTime.now();

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
