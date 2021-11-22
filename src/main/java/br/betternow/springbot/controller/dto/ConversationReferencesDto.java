package br.betternow.springbot.controller.dto;

import br.betternow.springbot.controller.form.enums.ConversationReferenceEnum;
import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.Map;

public class ConversationReferencesDto {

    private String uuid;
    private Map<ConversationReferenceEnum, SolctEcEnum> atributes;

    public ConversationReferencesDto(ConversationReference references) {
        this.uuid = references.getUuid();
        this.atributes = references.getAtributes();
    }

    public String getUuid() {
        return uuid;
    }

    public Map<ConversationReferenceEnum, SolctEcEnum> getAtributes() {
        return atributes;
    }
}
