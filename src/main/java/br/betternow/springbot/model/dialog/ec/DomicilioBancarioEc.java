package br.betternow.springbot.model.dialog.ec;

import java.util.HashMap;

public class DomicilioBancarioEc {

    private String title;
    private String message;
    private HashMap<String, String> choice;

    public DomicilioBancarioEc() {

    }

    public DomicilioBancarioEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    public HashMap<String, String> setChoice() {
        HashMap<String, String> choices = new HashMap<>();
        choices.put("Bradesco", "Bradesco");
        choices.put("Itau", "Itaú");
        choices.put("Banco_Do_Brasil", "Banco do Brasil");
        choices.put("Santander", "Santander");
        choices.put("Outros", "Outros");
        return choices;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<String, String> getChoice() {
        return choice;
    }
}
