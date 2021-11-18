package br.betternow.springbot.model.dialog.ec;

import java.util.HashMap;

public class SolicitacaoEc {

    private String title;
    private String message;
    private HashMap<String, String> choice;

    public SolicitacaoEc() {
    }

    public SolicitacaoEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    private HashMap<String,String> setChoice(){
        HashMap<String, String> choices = new HashMap<>();
        choices.put("Convivencia", "Convivência");
        choices.put("Sec", "SEC");
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
