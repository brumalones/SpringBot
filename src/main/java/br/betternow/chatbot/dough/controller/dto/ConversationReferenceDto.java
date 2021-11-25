package br.betternow.chatbot.dough.controller.dto;

import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.model.enums.DialogNameEnum;

import java.util.Map;

public class ConversationReferenceDto {

    private final String uuid;
    private final DialogNameEnum dialogStartet;
    private final Map<String, String> attributes;

    public ConversationReferenceDto(ConversationReference reference) {
        this.uuid = reference.getUuid();
        this.dialogStartet = reference.getDialogStartet();
        this.attributes = reference.getAttributes();
    }

    public String getUuid() {
        return uuid;
    }

    public DialogNameEnum getDialogStartet() {
        return dialogStartet;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

}
