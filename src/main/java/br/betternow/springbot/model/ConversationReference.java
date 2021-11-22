package br.betternow.springbot.model;

import br.betternow.springbot.controller.form.enums.ConversationReferenceEnum;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Map;

@Entity
public class ConversationReference {

    @Id
    @Column(nullable = false)
    private String uuid;

    @ElementCollection
    private Map<ConversationReferenceEnum, SolctEcEnum> atributes;

    public ConversationReference() {
    }

    public ConversationReference(String uuid, Map<ConversationReferenceEnum, SolctEcEnum> atributes) {
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

    public void setAtributes(Map<ConversationReferenceEnum, SolctEcEnum> atributes) {
        this.atributes = atributes;
    }


}
