package br.betternow.chatbot.dough.controller.dto.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.GenericDialogDto;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;

import java.util.HashMap;

public class DomicilioBancarioDto extends GenericDialogDto {

    public DomicilioBancarioDto(ConversationReference reference) {
        setDialogName(getClass().getSimpleName());
        setTitle("Solicitação de EC");
        setMessage("Informe o Domicilio Bancário");
        setChooseAction(choices());
        setRedirection("POST /dialogs/solicitacaoec/domcliobancario");
        setTypeable(false);
        setReferenceDto(reference);
    }

    public HashMap<SolicitarEcValoresEnum, String> choices() {
        HashMap<SolicitarEcValoresEnum, String> choices = new HashMap<>();
        choices.put(SolicitarEcValoresEnum.domclio_Bradesco, SolicitarEcValoresEnum.domclio_Bradesco.toText());
        choices.put(SolicitarEcValoresEnum.domclio_Itau, SolicitarEcValoresEnum.domclio_Itau.toText());
        choices.put(SolicitarEcValoresEnum.domclio_Banco_Do_Brasil, SolicitarEcValoresEnum.domclio_Banco_Do_Brasil.toText());
        choices.put(SolicitarEcValoresEnum.domclio_Santander, SolicitarEcValoresEnum.domclio_Santander.toText());
        choices.put(SolicitarEcValoresEnum.domclio_Outros, SolicitarEcValoresEnum.domclio_Outros.toText());
        return choices;
    }

}
