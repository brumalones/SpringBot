package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;

public class MeioPagamentoEc {

    private String title;
    private String message;
    private HashMap<SolctEcEnum, String> choice;

    public MeioPagamentoEc() {
    }

    public MeioPagamentoEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    private HashMap<SolctEcEnum, String> setChoice() {
        HashMap<SolctEcEnum, String> choices = new HashMap<>();
        choices.put(SolctEcEnum.meio_Pgto_Individual, SolctEcEnum.meio_Pgto_Individual.toText());
        choices.put(SolctEcEnum.meio_Pgto_Cadeia_Centralizada, SolctEcEnum.meio_Pgto_Cadeia_Centralizada.toText());
        choices.put(SolctEcEnum.meio_Pgto_Cadeia_Descentralizada, SolctEcEnum.meio_Pgto_Cadeia_Descentralizada.toText());
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
