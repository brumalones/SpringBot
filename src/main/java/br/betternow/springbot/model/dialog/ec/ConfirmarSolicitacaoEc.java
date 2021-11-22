package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.controller.form.enums.ConversationReferenceEnum;
import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;
import java.util.Map;

public class ConfirmarSolicitacaoEc {

    private String title;
    private Map<String, String> choice;
    private Map<ConversationReferenceEnum, SolctEcEnum> atributes;

    public ConfirmarSolicitacaoEc() {
    }

    public ConfirmarSolicitacaoEc(String title, ConversationReference reference) {
        this.title = title;
        this.choice = setChoice();
        this.atributes = reference.getAtributes();
    }

    public Map<String, String> setChoice() {
        Map<String, String> choices = new HashMap<>();
        choices.put("accept", "Ok, está tudo certo!");
        choices.put("reject", "Algo de errado não esta certo!");
        return choices;
    }

    public String getTitle() {
        return title;
    }

    public Map<String, String> getChoice() {
        return choice;
    }

    public Map<ConversationReferenceEnum, SolctEcEnum> getAtributes() {
        return atributes;
    }

}
