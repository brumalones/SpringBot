package br.betternow.chatbot.dough.model.enums;

public enum DialogNameEnum {

    solicitar_Ec("Solicitação de ECs"),
    transacao_Debito_Credito("Realizar transações Debito e Credito"),
    transacao_Cancelamento_Iata("Realizar transações/Cancelamentos IATA"),
    transacao_Cancelamento_Edi("Realizar transações/Cancelamentos EDI"),
    criar_Terminal("Criação de terminal"),
    solicitar_Cancelamento("Soliciatar cancelamanto"),
    rejeicao_CIP_Pagfor("Rejeição CIP/Pagfor");

    private final String text;

    DialogNameEnum(String text) {
        this.text = text;
    }

    public static DialogNameEnum fromText(String text) {
        for (DialogNameEnum dialogsEnum : DialogNameEnum.values()) {
            if (dialogsEnum.text.equalsIgnoreCase(text)) {
                return dialogsEnum;
            }
        }
        return null;
    }

    public String toText() {
        return text;
    }
}
