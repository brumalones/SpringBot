package br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums;

public enum SolicitarEcValoresEnum {

    tipo_Convivencia("Convivência"),
    tipo_Sec("SEC"),
    meio_Pgto_Individual("Individual"),
    meio_Pgto_Cadeia_Centralizada("Centralizado"),
    meio_Pgto_Cadeia_Descentralizada("Descentralizado"),
    bandeira_accept("Sim"),
    bandeira_reject("Não"),
    domclio_Bradesco("Bradesco"),
    domclio_Itau("Itaú"),
    domclio_Banco_Do_Brasil("Banco do Brasil"),
    domclio_Santander("Santander"),
    domclio_Outros("Outro");

    private String text;

    SolicitarEcValoresEnum(String text) {
        this.text = text;
    }

    public String toText() {
        return text;
    }

    public static SolicitarEcValoresEnum fromText(String text) {
        for (SolicitarEcValoresEnum ecValoresEnum : SolicitarEcValoresEnum.values()) {
            if (ecValoresEnum.text.equalsIgnoreCase(text)) {
                return ecValoresEnum;
            }
        }
        return null;
    }
}
