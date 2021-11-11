package com.example.SpringBot.model.dialog;

import java.util.ArrayList;
import java.util.List;

public class RootDialog {

    private String title;
    private String message;
    private ArrayList<String> choice;

    public RootDialog() {
    }

    public RootDialog(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoices();
    }

    private ArrayList<String> setChoices() {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Solicitação de ECs");
        choices.add("Realizar transações Debito e Credito");
        choices.add("Realizar transações/Cancelamentos IATA");
        choices.add("Realizar transações/Cancelamentos EDI");
        choices.add("Criação de terminal");
        choices.add("Soliciatar cancelamanto");
        choices.add("Rejeição CIP/Pagfor");
        return choices;
    }

    public ArrayList<String> getChoices() {
        return choice;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
