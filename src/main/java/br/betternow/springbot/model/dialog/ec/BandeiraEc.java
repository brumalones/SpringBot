package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;

public class BandeiraEc {

    private String title;
    private String message;
    private HashMap<SolctEcEnum, String> choice;

    public BandeiraEc() {

    }

    public BandeiraEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    public HashMap<SolctEcEnum, String> setChoice() {
        HashMap<SolctEcEnum, String> choices = new HashMap<>();
        choices.put(SolctEcEnum.bandeira_accept, SolctEcEnum.bandeira_accept.toText());
        choices.put(SolctEcEnum.bandeira_reject, SolctEcEnum.bandeira_reject.toText());
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
