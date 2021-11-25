package br.betternow.chatbot.dough.controller.dto;

import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcChavesEnum;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.model.enums.DialogNameEnum;

import java.util.Map;

public class ConversationReferenceDto {

    private String uuid;
    private DialogNameEnum dialogStartet;
    private Map<String, String> attributes;

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
