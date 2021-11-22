package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;

public class SolicitacaoEc {

    private String title;
    private String message;
    private HashMap<SolctEcEnum, String> choice;

    public SolicitacaoEc() {
    }

    public SolicitacaoEc(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoice();
    }

    private HashMap<SolctEcEnum,String> setChoice(){
        HashMap<SolctEcEnum, String> choices = new HashMap<>();
        choices.put(SolctEcEnum.tipo_Convivencia, SolctEcEnum.tipo_Convivencia.toText());
        choices.put(SolctEcEnum.tipo_Sec, SolctEcEnum.tipo_Sec.toText());
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
