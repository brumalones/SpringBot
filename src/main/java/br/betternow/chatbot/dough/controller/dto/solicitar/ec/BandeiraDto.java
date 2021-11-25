package br.betternow.chatbot.dough.controller.dto.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.GenericDialogDto;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;

import java.util.HashMap;

public class BandeiraDto extends GenericDialogDto {

    public BandeiraDto(ConversationReference reference) {
        setDialogName(getClass().getSimpleName());
        setTitle("Solicitação de EC");
        setMessage("Deseja inserir todas as bandeiras " +
                "e todos os tipos de pagamentos?");
        setChooseAction(choices());
        setRedirection("POST /dialogs/solicitacaoec/bandeira");
        setTypeable(false);
        setReferenceDto(reference);
    }

    public HashMap<SolicitarEcValoresEnum, String> choices() {
        HashMap<SolicitarEcValoresEnum, String> choices = new HashMap<>();
        choices.put(SolicitarEcValoresEnum.bandeira_accept, SolicitarEcValoresEnum.bandeira_accept.toText());
        choices.put(SolicitarEcValoresEnum.bandeira_reject, SolicitarEcValoresEnum.bandeira_reject.toText());
        return choices;
    }

}
