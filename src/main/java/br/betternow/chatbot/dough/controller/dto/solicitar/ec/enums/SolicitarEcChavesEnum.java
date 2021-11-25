package br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums;

import br.betternow.chatbot.dough.model.enums.DialogType;

public enum SolicitarEcChavesEnum {

    tipoEC("Tipo do EC"),
    meioPgtoEC("Meio de Pagamento do EC"),
    domclioEC("Domicilo Bancario do EC"),
    bandeiraEC("Bandeiras");

    private String text;

    SolicitarEcChavesEnum(String text) {
        this.text = text;
    }

    public String toText() {
        return text;
    }

    public static SolicitarEcChavesEnum fromText(String text) {
        for (SolicitarEcChavesEnum ecChavesEnum : SolicitarEcChavesEnum.values()) {
            if (ecChavesEnum.text.equalsIgnoreCase(text)) {
                return ecChavesEnum;
            }
        }
        return null;
    }

}
