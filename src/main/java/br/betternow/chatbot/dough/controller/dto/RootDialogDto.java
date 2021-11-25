package br.betternow.chatbot.dough.controller.dto;

import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.model.enums.DialogNameEnum;

import java.util.HashMap;

public class RootDialogDto extends GenericDialogDto {

    public RootDialogDto(ConversationReference reference) {
        setDialogName(getClass().getSimpleName());
        setTitle("Chat Bot - Dough");
        setMessage("Posso te ajudar a solicita massa para os seguintes itens:");
        setChooseAction(choices());
        setTypeable(false);
        setReferenceDto(reference);
        setRedirection("POST /dialog/current/rootdialog/new");
    }

    private HashMap<DialogNameEnum, String> choices() {
        HashMap<DialogNameEnum, String> choices = new HashMap<>();
        choices.put(DialogNameEnum.solicitar_Ec, DialogNameEnum.solicitar_Ec.toText());
        choices.put(DialogNameEnum.transacao_Debito_Credito, DialogNameEnum.transacao_Debito_Credito.toText());
        choices.put(DialogNameEnum.transacao_Cancelamento_Iata, DialogNameEnum.transacao_Cancelamento_Iata.toText());
        choices.put(DialogNameEnum.transacao_Cancelamento_Edi, DialogNameEnum.transacao_Cancelamento_Edi.toText());
        choices.put(DialogNameEnum.criar_Terminal, DialogNameEnum.criar_Terminal.toText());
        choices.put(DialogNameEnum.solicitar_Cancelamento, DialogNameEnum.solicitar_Cancelamento.toText());
        choices.put(DialogNameEnum.rejeicao_CIP_Pagfor, DialogNameEnum.rejeicao_CIP_Pagfor.toText());
        return choices;
    }

}
