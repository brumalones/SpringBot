package br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums;

public enum SolicitarEcChavesEnum {

    tipoEC("Tipo do EC"),
    meioPgtoEC("Meio de Pagamento do EC"),
    domclioEC("Domicilo Bancario do EC"),
    bandeiraEC("Bandeiras");

    private final String text;

    SolicitarEcChavesEnum(String text) {
        this.text = text;
    }

    public static SolicitarEcChavesEnum fromText(String text) {
        for (SolicitarEcChavesEnum ecChavesEnum : SolicitarEcChavesEnum.values()) {
            if (ecChavesEnum.text.equalsIgnoreCase(text)) {
                return ecChavesEnum;
            }
        }
        return null;
    }

    public String toText() {
        return text;
    }

}
