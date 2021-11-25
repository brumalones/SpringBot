package br.betternow.chatbot.dough.model;

import br.betternow.chatbot.dough.model.enums.DialogNameEnum;

import javax.persistence.*;
import java.util.Map;

@Entity
public class ConversationReference {

    @Id
    @Column(nullable = false)
    private String uuid;
    @Enumerated(EnumType.STRING)
    private DialogNameEnum dialogStartet;
    @ElementCollection
    private Map<String, String> attributes;

    public ConversationReference() {
    }

    public ConversationReference(String uuid) {
        this.uuid = uuid;
    }

    public ConversationReference(String uuid, DialogNameEnum dialogStartet, Map<String, String> attributes) {
        this.uuid = uuid;
        this.dialogStartet = dialogStartet;
        this.attributes = attributes;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DialogNameEnum getDialogStartet() {
        return dialogStartet;
    }

    public void setDialogStartet(DialogNameEnum dialogStartet) {
        this.dialogStartet = dialogStartet;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

}
