package br.betternow.springbot.model;

import java.util.List;
import java.util.Map;

public class ConversationReference {

    private String uuid;

    private Map<String, String> atributes;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Map<String, String> getAtributes() {
        return atributes;
    }

    public void setAtributes(Map<String, String> atributes) {
        this.atributes = atributes;
    }


}
