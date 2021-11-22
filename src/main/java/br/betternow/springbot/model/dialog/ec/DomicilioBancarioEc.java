package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;

public class DomicilioBancarioEc {

    private String title;
    private String message;
    private HashMap<SolctEcEnum, String> choice;

    public DomicilioBancarioEc() {

    }

    public DomicilioBancarioEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    public HashMap<SolctEcEnum, String> setChoice() {
        HashMap<SolctEcEnum, String> choices = new HashMap<>();
        choices.put(SolctEcEnum.domclio_Bradesco, SolctEcEnum.domclio_Bradesco.toText());
        choices.put(SolctEcEnum.domclio_Itau, SolctEcEnum.domclio_Itau.toText());
        choices.put(SolctEcEnum.domclio_Banco_Do_Brasil, SolctEcEnum.domclio_Banco_Do_Brasil.toText());
        choices.put(SolctEcEnum.domclio_Santander, SolctEcEnum.domclio_Santander.toText());
        choices.put(SolctEcEnum.domclio_Outros, SolctEcEnum.domclio_Outros.toText());
        return choices;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<SolctEcEnum, String> getChoice() {
        return choice;
    }
}
