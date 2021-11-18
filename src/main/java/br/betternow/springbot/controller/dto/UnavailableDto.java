package br.betternow.springbot.controller.dto;

import br.betternow.springbot.model.dialog.Unavailable;

public class UnavailableDto {

    private String title;
    private String message;


    public UnavailableDto(Unavailable unavailable) {
        this.title = unavailable.getTitle();
        this.message = unavailable.getMessage();
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
