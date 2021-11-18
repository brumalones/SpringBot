package br.betternow.springbot.model.dialog.ec;

import java.util.HashMap;

public class BandeiraEc {

    private String title;
    private String message;
    private HashMap<Integer, String> choice;

    public BandeiraEc() {

    }

    public BandeiraEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    public HashMap<Integer, String> setChoice() {
        HashMap<Integer, String> choices = new HashMap<>();
        choices.put(1, "Sim");
        choices.put(0, "Não");
        return choices;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<Integer, String> getChoice() {
        return choice;
    }
}
