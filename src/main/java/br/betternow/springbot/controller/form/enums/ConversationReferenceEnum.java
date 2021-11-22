package br.betternow.springbot.controller.form.enums;

public enum ConversationReferenceEnum {

    tipoEC("Tipo do EC"),
    meioPgtoEC("Meio de Pagamento do EC"),
    domclioEC("Domicilo Bancario do EC"),
    bandeiraEC("Bandeiras");

    private String text;

    ConversationReferenceEnum(String text) {
        this.text = text;
    }

    public String toText() {
        return text;
    }

}
