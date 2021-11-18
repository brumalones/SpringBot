package br.betternow.springbot.model.dialog.ec;

import java.util.HashMap;

public class MeioPagamentoEc {

    private String title;
    private String message;
    private HashMap<String, String> choice;

    public MeioPagamentoEc() {
    }

    public MeioPagamentoEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    private HashMap<String,String> setChoice(){
        HashMap<String, String> choices = new HashMap<>();
        choices.put("Individual", "Individual");
        choices.put("Cadeia_Centralizada", "Cadeia Centralizada");
        choices.put("Cadeia_Descentralizada", "Cadeia Descentralizada");
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
