package br.betternow.springbot.controller.form;

import br.betternow.springbot.controller.form.enums.ConversationReferenceEnum;
import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;
import br.betternow.springbot.repository.ConversationReferenceRepository;

import java.util.HashMap;
import java.util.Map;

public class ConversationReferenceForm {

    private String uuid;

    private HashMap<ConversationReferenceEnum, SolctEcEnum> atributes;

    public ConversationReferenceForm() {
    }

    public ConversationReferenceForm(String uuid, HashMap<ConversationReferenceEnum, SolctEcEnum> atributes) {
        this.uuid = uuid;
        this.atributes = atributes;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Map<ConversationReferenceEnum, SolctEcEnum> getAtributes() {
        return atributes;
    }

    public void setAtributes(HashMap<ConversationReferenceEnum, SolctEcEnum> atributes) {
        this.atributes = atributes;
    }

    public ConversationReference update(String uuid, ConversationReferenceRepository referenceRepository) {
        ConversationReference conversationReference = referenceRepository.getById(uuid);
        conversationReference.setAtributes(this.atributes);
        return conversationReference;
    }
}
