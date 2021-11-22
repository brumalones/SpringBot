package br.betternow.springbot.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ValidationHandler {

    @Autowired
    private MessageSource source;

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    public GenericHandler notValid(NullPointerException exception) {

        GenericHandler genericHandler = new GenericHandler("Atributtes","Atributte Fields not set");

        return genericHandler;
    }

}
