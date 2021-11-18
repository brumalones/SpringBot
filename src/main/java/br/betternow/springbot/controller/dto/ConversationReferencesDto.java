package br.betternow.springbot.controller.dto;

import br.betternow.springbot.model.ConversationReference;

public class ConversationReferencesDto {

    private String uuid;

    public ConversationReferencesDto(ConversationReference references) {
        this.uuid = references.getUuid();
    }

    public String getUuid() {
        return uuid;
    }
}
