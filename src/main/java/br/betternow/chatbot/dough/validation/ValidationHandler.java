package br.betternow.chatbot.dough.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationHandler {

    @Autowired
    private MessageSource source;

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    public GenericHandler notValid(NullPointerException exception) {

        return new GenericHandler("Attributtes", "Attributte Fields not set");
    }

}
