package br.betternow.springbot.model.dialog;

public class Unavailable {

    private String title;
    private String message;

    public Unavailable() {
    }

    public Unavailable(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
